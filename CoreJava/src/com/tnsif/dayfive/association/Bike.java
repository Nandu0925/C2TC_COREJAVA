//Program to demonstrate IS A Association
package com.tnsif.dayfive.association;

// Parent class
public class Bike {

    private String color;
    private int topSpeed;
  
    public void setTopSpeed(int topSpeed)
    {
    	this.topSpeed=topSpeed;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    // print bike information
    public void bikeInfo()
    {
        System.out.println("Bike Color= " + color
                          + " Top Speed= " + topSpeed);
    }
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of Bike class
        Bike Ktm390 = new Bike();

        Ktm390.setColor("ORANGE");
        Ktm390.setTopSpeed(179);
  
        // Calling bikeInfo() over object of Bike class
        Ktm390.bikeInfo();
  
        // Creating an object of KTM class
        KTM ktm = new KTM();
        ktm.KTM_DEMO();
    }
       
    }
   
    // Child class
    class KTM extends Bike {
        public void KTM_DEMO()
        {
            // Creating an object of Engine type
            // using engine_kill() method
            // KTM_Engine is name of an object
            Engine KTM_Engine = new Engine();
            KTM_Engine.engine_on();
            KTM_Engine.engine_kill();
        }
    }
    
    class Engine {
        // To start the engine
        public void engine_on()
        {
            // Print when engine is turned on
            System.out.println("Ignition On..");
        }
        // To stop the engine
        public void engine_kill()
        {
            // Print when engine is turned off
            System.out.println("Ignition killed..");
        }
    }
