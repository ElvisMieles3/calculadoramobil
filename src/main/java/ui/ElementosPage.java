package ui;

import net.serenitybdd.screenplay.targets.Target;

public class ElementosPage {
    public static final Target RESULTADO = Target.the("campo resultado").
            locatedBy("//*[@resource-id='com.google.android.calculator:id/result_final']");

    public static final Target NUMERO = Target.the("botón número").
            locatedBy("//*[@resource-id='com.google.android.calculator:id/digit_{0}']");

    public static final Target SUMA = Target.the("botón suma").
            locatedBy("//*[@resource-id='com.google.android.calculator:id/op_add']");

    public static final Target RESTA = Target.the("botón resta").
            locatedBy("//*[@resource-id='com.google.android.calculator:id/op_sub']");

    public static final Target MULTIPLICACION = Target.the("botón de Multiplicación").
            locatedBy("//*[@resource-id='com.google.android.calculator:id/op_mul']");


    public static final Target DIVISION = Target.the("botón de Multiplicación").
            locatedBy("//*[@resource-id='com.google.android.calculator:id/op_div']");

    public static final Target IGUAL = Target.the("botón igual")
            .locatedBy("//*[@resource-id='com.google.android.calculator:id/eq']");


}
