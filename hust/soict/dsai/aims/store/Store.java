package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBER_ODERED = 20;

    private static int numberOdDVDs = 0;
    Cart cart = new Cart();
    private DigitalVideoDisc[] itemInStore = new DigitalVideoDisc[MAX_NUMBER_ODERED];

    public void print(){
        for(int i = 0;i<numberOdDVDs;i++){
            System.out.printf("%s\n",itemInStore[i].toString());
        }
    }

    public void addDVD(DigitalVideoDisc disc){
        if(numberOdDVDs >= 20){
            System.out.println("The list is full!!!");
        }
        else{
            itemInStore[numberOdDVDs] = disc;
            numberOdDVDs++;
        }
    }


    public void removeDVDs(DigitalVideoDisc disc){
        int check = 0;
        for(int i = 0;i<numberOdDVDs;i++){
            if(cart.compareDisc(itemInStore[i],disc) == true){
                check = i;
                break;
            }
        }

        if(check == 0) System.out.println("Wrong DVDs!!!");
        else{
            for(int j = check;j<numberOdDVDs;j++){
                itemInStore[j] = new DigitalVideoDisc(itemInStore[j+1].getTitle(),itemInStore[j+1].getCategory(),itemInStore[j+1].getDirector(),itemInStore[j+1].getLength(),itemInStore[j+1].getCost());

            }
            System.out.println("DVDs have been removed successfully!");
            numberOdDVDs--;
        }
    }
}
