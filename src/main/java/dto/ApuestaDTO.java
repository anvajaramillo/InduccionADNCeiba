package dto;


public class ApuestaDTO {
	
	private Long id;
	private int dinero;
	private String nombre;
	private String cedula;
	private int puntajePais1;
	private int puntajePais2;
	private boolean isGanador;
    private int dineroGanado;
    private PartidoDTO partido;
    
	public ApuestaDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getPuntajePais1() {
		return puntajePais1;
	}

	public void setPuntajePais1(int puntajePais1) {
		this.puntajePais1 = puntajePais1;
	}

	public int getPuntajePais2() {
		return puntajePais2;
	}

	public void setPuntajePais2(int puntajePais2) {
		this.puntajePais2 = puntajePais2;
	}

	public boolean isGanador() {
		return isGanador;
	}

	public void setGanador(boolean isGanador) {
		this.isGanador = isGanador;
	}

	public int getDineroGanado() {
		return dineroGanado;
	}

	public void setDineroGanado(int dineroGanado) {
		this.dineroGanado = dineroGanado;
	}

	public PartidoDTO getPartido() {
		return partido;
	}

	public void setPartido(PartidoDTO partido) {
		this.partido = partido;
	}
	

}
