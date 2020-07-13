package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.ElementosPage;

public class Multiplicacion implements Task {
    private String numero1;
    private String numero2;

    public Multiplicacion(String numero1, String numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ElementosPage.NUMERO.of(numero1)),
                Click.on(ElementosPage.MULTIPLICACION),
                Click.on(ElementosPage.NUMERO.of(numero2)),
                Click.on(ElementosPage.IGUAL));
    }
    public static Multiplicacion losNumeros(String numero1, String numero2) {

        return new Multiplicacion(numero1, numero2);
    }
}
