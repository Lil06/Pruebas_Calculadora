package steps;
 
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;


public class SauceDemoSteps {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
    

    /*Suma*/ 
    @Given("Navego a la página de la Calculadora Básica")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }
    
    @When("Ingreso 1 en el campo Build")
    public void selectFromDropdownByValue(){
        landingPage.selectFromDropdownByValue();
    }

    @And("Ingreso {word} en el campo Number 1")
    public void escribirNum(String num1) {
        landingPage.escribir(num1);
    }

    @And("Ingreso {word} en el campo Number 2")
    public void escribirNum2(String num2) {
        landingPage.write2(num2);
    }
    
    @And("Selecciono la operación Add")
    public void selectDropmenu(){
        landingPage.selectFromDropdownOp();
    }

    @And("Hago clic en el botón Calculate")
    public void clickCalculateSauce() {
        landingPage.clickCalculate();
    }


   /*@Then("Debería ver 5 como resultado en el campo Answer")
    public void getTextppp(){
        String ans = "5";
        String ot = landingPage.getTextpp();
        ot.toString()
        Assert.assertEquals(ot,ans);}*/
                
    

    /*Resta*/
    
    @And("Selecciono la operación Subtract")
    public void selectDropmenu2(){
        landingPage.selectFromDropdownOp2();
    }




    //concatenar

    @And("Selecciono la operación Concatenate")
    public void selectDropmenu3(){
        landingPage.selectFromDropdownOp4();
    }
    
    @And("limpio los campos elementSpace1")
    public void limpiarCampos1() {
    landingPage.limpio_los_campos_1();
}

    @And("limpio los campos elementSpace2")
    public void limpiarCampo2() {
    landingPage.limpio_los_campos_2();
}

    @And("limpio los campos Answer")
    public void limpiarCampo3() {
    landingPage.limpiar_respuesta();
}

}