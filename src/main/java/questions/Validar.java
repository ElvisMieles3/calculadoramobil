package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Validar implements Question<String> {
	
	private Target target;
	
    public Validar(Target target) {
		this.target = target;
	}

	@Override
    public String answeredBy(Actor actor) {

		return target.resolveFor(actor).getAttribute("text");
    }

    public static Validar elTexto(Target target){
        return new Validar(target);
    }
}
