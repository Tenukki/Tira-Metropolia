/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava1;

/**
 *
 * @author Santeri
 */
public class Stack {
    
    private ListItem mTop;
    private int mSize;

    public Stack() {
        this.mTop = null;
        this.mSize = 0;
    }
    
    //muodostetaan uusi lista alkio, asetetaaan se pinon huipulle
    public void push(String aData){
        ListItem newItem = new ListItem();
        newItem.setmData(aData); 
        newItem.setmNext(mTop); //kytketään uusi lista-alkio aikaisempaan huippulakioon
        mTop = newItem; // uusi alkio pinon huippu alkioksi
        mSize++;
    }
    
    //poistetaan lista lakio pinon huipulta, jos pino tyjhä plautetaan null
    public ListItem pop(){
        ListItem b = mTop;
        ListItem a = mTop.getmNext();
        mTop = a;
        mSize--;
        return b;
    }
    
    public void printItems(){
        for (int i = 0; i < mSize; i++) {
            
        }
        
    }
    
    public int getSize(){
        return mSize;
    }
    
    
    
    
}
