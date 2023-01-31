using System;
using System.Collections.Generic;

public class RentalTime
{
    public DateTime Start { get; private set; }
    public DateTime End { get; private set; }

    public RentalTime(DateTime start, DateTime end)
    {
        this.Start = start;
        this.End = end;
    }
}

public static class CarRental
{
    public static bool CanScheduleAll(IEnumerable<RentalTime> unloadingTimes)
    {
        throw new InvalidOperationException("Waiting to be implemented.");
    }

    public static void Main(string[] args)
    {
        var format = System.Globalization.CultureInfo.InvariantCulture.DateTimeFormat;
        RentalTime[] unloadingTimes = new RentalTime[]
        {
            new RentalTime(DateTime.Parse("3/4/2019 19:00", format), DateTime.Parse("3/4/2019 20:30", format)),
            new RentalTime(DateTime.Parse("3/4/2019 22:10", format), DateTime.Parse("3/4/2019 22:30", format)),
            new RentalTime(DateTime.Parse("3/4/2019 20:30", format), DateTime.Parse("3/4/2019 22:00", format))
        };
        Console.WriteLine(CarRental.CanScheduleAll(unloadingTimes));
    }
}