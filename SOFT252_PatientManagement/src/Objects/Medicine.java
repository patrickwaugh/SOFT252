/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author patrick
 */
public class Medicine 
{
    protected String name;
    protected boolean lowQuantity;

    public Medicine(String name, boolean lowQuantity) {
        this.name = name;
        this.lowQuantity = lowQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOrderRequired() {
        return lowQuantity;
    }

    public void setOrderRequired(boolean lowQuantity) {
        this.lowQuantity = lowQuantity;
    }
    
    
}