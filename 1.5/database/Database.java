package com.company.database;
import java.util.ArrayList;
import java.util.Random;

public class Database <T>{
    private ArrayList<T> data = new ArrayList<>();
    private int maxConnections;
    private int currentConnections;
    private int recordAmount;
    private ArrayList<Connection> connectionsList = new ArrayList<>();

    public Database(int maxCons){
        if (maxCons > 0) this.maxConnections = maxCons;
        else throw new IllegalArgumentException("Max Connections value must be positive");
    }

    public int getMax(){
        return maxConnections;
    }

    public int getCurrent(){
        return currentConnections;
    }

    public int getRecordAmount(){
        return recordAmount;
    }

    public void closeConnection(Connection toClose){
        currentConnections--;
        connectionsList.remove(toClose);
    }

    public void changeMaxCons(int value){
        if (value < this.maxConnections)
            for (int i = 0; i<this.maxConnections - value; i++) closeConnection(connectionsList.get(i));
        else this.maxConnections = value;
    }

    public Connection openConnection(){
        if (Database.this.currentConnections >= Database.this.maxConnections)
            return null;
        return new Connection();
    }

    public class Connection{
        private Connection(){};

        {
         Database.this.currentConnections++;
        }

        public T getFromDb(int index){
            if (index > Database.this.recordAmount-1) return null;
            return Database.this.data.get(index);
        }

        public void addToDb(T toAdd){
            Database.this.data.add(toAdd);
            Database.this.recordAmount++;
        }
    }
}
