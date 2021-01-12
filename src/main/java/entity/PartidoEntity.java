package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import dto.PartidoDTO;

@Entity
@Table(name = "partidos")
public class PartidoEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String pais1;
	private String pais2;
	
	@Column(name="hora_inicio")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
	private Date horaInicio;
	
	@Column(name="hora_fin")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
	private Date horaFin;
	
	@Column(name="puntaje_pais1")
	private int puntajePais1;
	
	@Column(name="puntaje_pais2")
	private int puntajePais2;
	
	public PartidoEntity() {
		super();
	}

	public PartidoEntity(Long id) {
		super();
		this.id = id;
	}
	
	public PartidoEntity(String pais1, String pais2, Date horaInicio) {
		super();
		this.pais1 = pais1;
		this.pais2 = pais2;
		this.horaInicio = horaInicio;
	}

	public PartidoEntity(Long id, String pais1, String pais2, Date horaInicio, Date horaFin, int puntajePais1,
			int puntajePais2) {
		super();
		this.id = id;
		this.pais1 = pais1;
		this.pais2 = pais2;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.puntajePais1 = puntajePais1;
		this.puntajePais2 = puntajePais2;
	}

	public PartidoEntity(PartidoDTO partidoDto) {
		this.id = partidoDto.getId();
		this.pais1 = partidoDto.getPais1();
		this.pais2 = partidoDto.getPais2();
		this.horaInicio = partidoDto.getHoraInicio();
		this.horaFin = partidoDto.getHoraFin();
		this.puntajePais1 = partidoDto.getPuntajePais1();
		this.puntajePais2 = partidoDto.getPuntajePais2();
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

	private static final long serialVersionUID = 1L;

}
