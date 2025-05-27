package pages;

import org.openqa.selenium.support.ui.Select;

public class PaginaPrincipal extends BasePage {

    private String dropDownbuild = "//select[@id='selectBuild']";
    private String opselector = "//select[@id='selectOperationDropdown']";
    private String elementSpace1 = "//input[@id='number1Field']";
    private String elementSpace2 = "//input[@id='number2Field']";
    private String Calculate = "//*[@id='calculateButton']";
    private String Answer = "//input[@id='clearButton']";
    
 
    public PaginaPrincipal() {
        super(driver);
    }
 
    // Método para navegar a www.saucedemo.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://testsheepnz.github.io/BasicCalculator.html");

    }  
     
    public void selectFromDropdownByValue(){
        selectFromDropdownByValue(dropDownbuild, "1");
 
    }

     public void escribir(String keysToSend) {
        write(elementSpace1, keysToSend);
    }

    public void write2(String keysToSend) {
        write(elementSpace2, keysToSend);

    }


    public void escribirCampoResultado(String keysToSend) {
        write(Answer, keysToSend);

    }

    public void selectFromDropdownOp() {
        selectFromDropdownByIndex(opselector, 0);
    }

    public void selectFromDropdownOp2() {
        selectFromDropdownByIndex(opselector, 1);
    }
    
    public void selectFromDropdownOp4() {
        selectFromDropdownByIndex(opselector, 4);
    }
    

    public void clickCalculate(){
        clickElement(Calculate);
    }

    public void limpio_los_campos_1() {
    write(elementSpace1, " ");
}


    public void limpio_los_campos_2() {
    write(elementSpace2, " ");
}


    public void limpiar_respuesta(){
        clickElement(Answer);

    }




}