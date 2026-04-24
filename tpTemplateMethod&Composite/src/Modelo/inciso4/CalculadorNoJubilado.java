package Modelo.inciso4;
import static java.time.LocalDate.now;

public class CalculadorNoJubilado extends Calculador {
    private final float RECARGO_MISMO_MES = 0.15F;
    private final float RECARGO_DISTINTO_MES = 0.21F;

    public CalculadorNoJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    public float recargoMismoMes() {
        return RECARGO_MISMO_MES;
    }
    @Override
    public float recargoDistintomes() {
        return RECARGO_DISTINTO_MES;
    }
}