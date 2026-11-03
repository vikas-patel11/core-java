package com.core_java.multithread.synchronization;


class BookThreaterSeat {

    int totalSeats =10;

    synchronized public void bookSeats(int bookSeats){

        if(totalSeats>=bookSeats){
            System.out.println(bookSeats +" Seats Booked!");
            totalSeats = totalSeats-bookSeats;
            System.out.println(totalSeats +" Seats Available!");
        }else {
            System.out.println(bookSeats +" Seats Not Available!");
        }

    }





}
public class MovieBookApp extends Thread {
    static BookThreaterSeat bookThreaterSeat;
    int seats;
    @Override
    public void run(){
    bookThreaterSeat.bookSeats(seats);

    }

    public static void main(String[] args) {
         bookThreaterSeat = new BookThreaterSeat();
         MovieBookApp vikas =new MovieBookApp();
         vikas.seats=7;
         vikas.start();

        MovieBookApp vipin =new MovieBookApp();
        vipin.seats=6;
        vipin.start();
    }
}
