package rfef;

import java.time.LocalDate;

public class EquipoFutbol {
    private String nombreEquipo;
    private String ciudad;
    private String nombreCampo;
    private LocalDate fechaFundacion;
    private EntrenadorMario entrenador;
    private PorteroMario portero;
    private DefensaMario central1, central2, interiorIzq, interiorDcha;
    private CentrocampistaMario centro1, centro2, centro3;
    private DelanteroMario extremoIzq, extremoDcha, delanteroCentro;
    private int puntos;

    public EquipoFutbol(String nombreEquipo, String ciudad, String nombreCampo, LocalDate fechaFundacion,
                        EntrenadorMario entrenador, PorteroMario portero, DefensaMario central1, DefensaMario central2,
                        DefensaMario interiorIzq, DefensaMario interiorDcha,
                        CentrocampistaMario centro1, CentrocampistaMario centro2, CentrocampistaMario centro3,
                        DelanteroMario extremoIzq, DelanteroMario extremoDcha, DelanteroMario delanteroCentro,
                        int puntos) {
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.nombreCampo = nombreCampo;
        this.fechaFundacion = fechaFundacion;
        this.entrenador = entrenador;
        this.portero = portero;
        this.central1 = central1; 
        this.central2 = central2; 
        this.interiorIzq = interiorIzq; 
        this.interiorDcha = interiorDcha;
        this.centro1 = centro1; 
        this.centro2 = centro2; 
        this.centro3 = centro3;
        this.extremoIzq = extremoIzq; 
        this.extremoDcha = extremoDcha; 
        this.delanteroCentro = delanteroCentro;
        this.puntos = puntos;
    }

    public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombreCampo() {
		return nombreCampo;
	}

	public void setNombreCampo(String nombreCampo) {
		this.nombreCampo = nombreCampo;
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public EntrenadorMario getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(EntrenadorMario entrenador) {
		this.entrenador = entrenador;
	}

	public DefensaMario getCentral1() {
		return central1;
	}

	public void setCentral1(DefensaMario central1) {
		this.central1 = central1;
	}

	public DefensaMario getCentral2() {
		return central2;
	}

	public void setCentral2(DefensaMario central2) {
		this.central2 = central2;
	}

	public DefensaMario getInteriorIzq() {
		return interiorIzq;
	}

	public void setInteriorIzq(DefensaMario interiorIzq) {
		this.interiorIzq = interiorIzq;
	}

	public DefensaMario getInteriorDcha() {
		return interiorDcha;
	}

	public void setInteriorDcha(DefensaMario interiorDcha) {
		this.interiorDcha = interiorDcha;
	}

	public CentrocampistaMario getCentro1() {
		return centro1;
	}

	public void setCentro1(CentrocampistaMario centro1) {
		this.centro1 = centro1;
	}

	public CentrocampistaMario getCentro2() {
		return centro2;
	}

	public void setCentro2(CentrocampistaMario centro2) {
		this.centro2 = centro2;
	}

	public CentrocampistaMario getCentro3() {
		return centro3;
	}

	public void setCentro3(CentrocampistaMario centro3) {
		this.centro3 = centro3;
	}

	public void setPortero(PorteroMario portero) {
		this.portero = portero;
	}

	public void setExtremoIzq(DelanteroMario extremoIzq) {
		this.extremoIzq = extremoIzq;
	}

	public void setExtremoDcha(DelanteroMario extremoDcha) {
		this.extremoDcha = extremoDcha;
	}

	public void setDelanteroCentro(DelanteroMario delanteroCentro) {
		this.delanteroCentro = delanteroCentro;
	}

	public String getNombreEquipo() { return nombreEquipo; }
    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }

    public PorteroMario getPortero() { return portero; }
    public DelanteroMario getDelanteroCentro() { return delanteroCentro; }
    public DelanteroMario getExtremoIzq() { return extremoIzq; }
    public DelanteroMario getExtremoDcha() { return extremoDcha; }

    @Override
    public String toString() {
        return nombreEquipo + " | Puntos: " + puntos + " | Portero: " + portero + " | Delanteros: " + extremoIzq + ", " + extremoDcha + ", " + delanteroCentro;
    }
}
