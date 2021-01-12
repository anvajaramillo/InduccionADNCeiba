package dto;

import java.util.Date;

public class PartidoDTO {

	private Long id;
	private String pais1;
	private String pais2;
	private Date horaInicio;
	private Date horaFin;
	private int puntajePais1;
	private int puntajePais2;

	public PartidoDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPais1() {
		return pais1;
	}

	public void setPais1(String pais1) {
		this.pais1 = pais1;
	}

	public String getPais2() {
		return pais2;
	}

	public void setPais2(String pais2) {
		this.pais2 = pais2;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
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

}
