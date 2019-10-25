/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtävä2;

/**
 *
 * @author Santeri
 */
public class Line {
    
    private ListItem mTop;
    private ListItem mBottom;
    private int mSize;

    public Line() {
        this.mTop = null;
        this.mSize = 0;
    }
    
    //muodostetaan uusi lista alkio, asetetaaan se pinon huipulle
    public void push(String aData){
        if(mSize == 0){
            ListItem newItem = new ListItem();
            newItem.setmData(aData); 
            mBottom = newItem;
            newItem.setmNext(mTop);
            mTop = newItem;
            mSize++;
        }else{
            ListItem newItem = new ListItem();
            newItem.setmData(aData); 
            newItem.setmNext(mTop); //kytketään uusi lista-alkio aikaisempaan huippulakioon
            mTop = newItem; // uusi alkio pinon huippu alkioksi
            mSize++;
        }
        
    }
    
    //poistetaan lista lakio pinon huipulta, jos pino tyjhä plautetaan null
    public ListItem pop(){
        if(mSize == 1 || mSize == 0){
            mSize--;
            mBottom = null;
            mTop = null;
            
            return null;
        }
        
        ListItem current = mTop;
        
        for (int i = 1; i < mSize-1; i++) {
            if (i == mSize-1) {
                current.setmNext(null);
                mBottom = current;
                break;
            }else{
                current = current.getmNext();
            }
        }
        mSize--;
        
        return mBottom;
            
        
     
            
    }

    
    public void printItems(){
        
        ListItem eka = mTop;
        for (int i = 0; i < mSize; i++) {
            System.out.println(eka.getmData());
            eka = eka.getmNext();
        }
        
    }
    
    public int getSize(){
        return mSize;
    }
    
    
    
    
}
