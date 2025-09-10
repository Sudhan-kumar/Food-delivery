public class Lasagna {

    static int expectedTimeInOven=40;
    static int expectedTimePerLayer=2;
    public int expectedMinutesInOven()
    {
        return expectedTimeInOven;
    }

    public int remainingMinutesInOven(int actualTime)
    {
        return 40-actualTime;
    }

    public int preparationTimeInMinutes(int layer)
    {
       
        return  expectedTimePerLayer*layer;
    }

     public int totalTimeInMinutes(int layer,int min)
    {
        return 2*layer+min;
    }

   
}
