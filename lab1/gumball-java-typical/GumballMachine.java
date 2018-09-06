
public class GumballMachine
{

    private int num_gumballs;
    private int cost_gumballs;
    private int total_cost;
    private int machine_number;
    private boolean has_coin;

    public GumballMachine( int size, int machine)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.machine_number = machine;
        this.total_cost = 0;
        this.has_coin = false;
    }

    public void insertQuarter(int coin)
    {
        if (machine_number == 1)
        {
            this.cost_gumballs = 25;
            if ( coin == 25 )
            {
                this.has_coin = true ;
                this.total_cost = total_cost + coin ;
            }
            else
                System.out.println( "Insert quarter only" ) ;
        }
        else if (machine_number == 2)
        {
            this.cost_gumballs = 50;
            if ( coin == 25 )
            {
                this.has_coin = true ;
                this.total_cost = total_cost + coin ;
            }
            else
                System.out.println( "Insert quarter only" ) ;
        }
        else if (machine_number == 3)
        {
            this.cost_gumballs = 50;
            if ((coin == 25) || (coin == 5) || (coin == 10))
            {
                this.has_coin = true ;
                this.total_cost = total_cost + coin ;
            }
            else
                this.has_coin = false ;
        }
        else 
        {
            System.out.println( "Machine does not exist!" ) ;
        }
    }
    
    
    
    public void turnCrank()
    {
        if ( (this.has_coin) && (this.total_cost == cost_gumballs) )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_coin = false ;
                this.total_cost = 0 ;
                System.out.println( "Thanks for your money.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your money." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a coin" ) ;
        }        
    }
}
