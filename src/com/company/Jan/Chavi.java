package com.company.Jan;

import java.util.Scanner;

public class Chavi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    public static int countTotalPassengers(Bus[] buses, int value)
    {
//        if()
//        {
//
//        }
//        else
//        {
//            return 0;
//        }
        return 0;

    }
    public static void searchBus()
    {

    }

}
class Bus
{
    int busNo;
    String travelsName;
    int passengerCount;
    int  busStop;
    Bus(int busNo, String travelsName, int passengerCount, int busStop)
    {
        this.busNo=busNo;
        this.travelsName=travelsName;
        this.passengerCount=passengerCount;
        this.busStop=busStop;
    }
    public int getBusNo()
    {
        return busNo;
    }
    public void setBusNo(int busNumber)
    {
        this.busNo=busNumber;
    }
    public String getName()
    {
        return travelsName;
    }
    public void setName(String newName)
    {
        this.travelsName=newName;
    }
    public int getPassengerCount()
    {
        return passengerCount;
    }
    public void setPassengerCount(int passCount)
    {
        this.passengerCount=passCount;
    }
    public int getBusStop()
    {
        return busStop;
    }
    public void setBusStop(int buStop)
    {
        this.busStop=buStop;
    }
}

