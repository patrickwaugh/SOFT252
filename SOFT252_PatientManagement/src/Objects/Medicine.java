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
    protected String medicineId, name;
    protected boolean lowQuantity;

    public Medicine(String medicineId, String name, boolean lowQuantity) {
        this.medicineId = medicineId;
        this.name = name;
        this.lowQuantity = lowQuantity;
    }
    
    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLowQuantity() {
        return lowQuantity;
    }

    public void setLowQuantity(boolean lowQuantity) {
        this.lowQuantity = lowQuantity;
    }
    
    
}