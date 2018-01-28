
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args)throws Exception {
        
        System.out.println("Top ten players based on goals: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 players based on penalty amounts: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Statistics for Sidney Crosby :");
        NHLStatistics.searchByPlayer("Sydney Crosby");
        
        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        System.out.println("Statistics for Anaheim Ducks: ");
        NHLStatistics.teamStatistics("ANA"); NHLStatistics.sortByPoints();
        
        
        
        
        
        
    }
}
