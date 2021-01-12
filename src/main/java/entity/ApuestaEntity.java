package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import dto.ApuestaDTO;

@Entity
@Table(name = "apuestas")
public class ApuestaEntity  implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private int dinero;
	private String nombre;
	private String cedula;
	private int puntajePais1;
	private int puntajePais2;
	
	@Column(name="is_ganador")
	private boolean isGanador;
	
	@Column(name="dinero_ganado")
	private int dineroGanado;
	
	@OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "partido_id", referencedColumnName = "id")
    private PartidoEntity partido;
	
	public ApuestaEntity() {
		super();
	}

	public ApuestaEntity(Long id, int dinero, String nombre, String cedula, int puntajePais1, int puntajePais2,
			PartidoEntity partidoEntity) {
		super();
		this.id = id;
		this.dinero = dinero;
		this.nombre = nombre;
		this.cedula = cedula;
		this.puntajePais1 = puntajePais1;
		this.puntajePais2 = puntajePais2;
		this.partido = partidoEntity;
	}
	
	public ApuestaEntity(ApuestaDTO apuestaDTO) {
		this.id = apuestaDTO.getId();
		this.dinero = apuestaDTO.getDinero();
		this.nombre = apuestaDTO.getNombre();
		this.cedula = apuestaDTO.getCedula();
		this.puntajePais1 = apuestaDTO.getPuntajePais1();
		this.puntajePais2 = apuestaDTO.getPuntajePais2();
		this.isGanador = apuestaDTO.isGanador();
		this.dineroGanado = apuestaDTO.getDineroGanado();
		this.partido = new PartidoEntity(apuestaDTO.getPartido());
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

	public PartidoEntity getPartidoEntity() {
		return partido;
	}

	public void setPartidoEntity(PartidoEntity partidoEntity) {
		this.partido = partidoEntity;
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

	public PartidoEntity getPartido() {
		return partido;
	}

	public void setPartido(PartidoEntity partido) {
		this.partido = partido;
	}

	private static final long serialVersionUID = 1L;

}
