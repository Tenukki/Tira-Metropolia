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
public class ListItem {
    
    private String mData;
    private ListItem mNext;

    public ListItem() {
        this.mNext = null;
    }

    public String getmData() {
        return mData;
    }

    public void setmData(String mData) {
        this.mData = mData;
    }

    public ListItem getmNext() {
        return mNext;
    }

    public void setmNext(ListItem mNext) {
        this.mNext = mNext;
    }
    
    
    
}
