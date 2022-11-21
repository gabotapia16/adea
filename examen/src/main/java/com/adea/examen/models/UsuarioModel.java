package com.adea.examen.models;



import java.sql.Date;

import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="usuario")
public class UsuarioModel {

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(unique = true, name="login", nullable = false, length = 20)
    private String login;

    @Column(name="password", nullable = false, length = 30)
    private String password;

    @Column(name="nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name="cliente", nullable = false)
    private Float cliente;

    @Column(name="email", nullable = true, length = 50)
    private String email;

    @ColumnDefault( value = "CURRENT_TIMESTAMP" )
    @Column(name="fechaalta", nullable = false)
    private Date fechaalta;

    @Column(name="fechabaja", nullable = true)
    private Date fechabaja;

    @ColumnDefault(value = "'A'")
    @Column(name="status", nullable = false, columnDefinition="char(1)")
    private String status;

    @Column(name="intentos", nullable = false, columnDefinition = " float default 0")
    private Float intentos;

    @Column(name="fecharevocado", nullable = true)
    private Date fecharevocado;

    @Column(name="fecha_vigencia", nullable = true)
    private Date fecha_vigencia;

    @Column(name="no_acceso", nullable = true)
    private Integer no_acceso;

    @Column(name="apellido_paterno", nullable = true, length = 50)
    private String apellido_paterno;

    @Column(name="apellido_materno", nullable = true, length = 50)
    private String apellido_materno;

    @Column(name="area", nullable = true, columnDefinition = " integer(4)")
    private Integer area;

    @ColumnDefault( value = "CURRENT_TIMESTAMP" )
    @Column(name="fechamodificacion", nullable = false)
    private Date fechamodificacion;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getCliente() {
        return cliente;
    }

    public void setCliente(Float cliente) {
        this.cliente = cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public Date getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getIntentos() {
        return intentos;
    }

    public void setIntentos(Float intentos) {
        this.intentos = intentos;
    }

    public Date getFecharevocado() {
        return fecharevocado;
    }

    public void setFecharevocado(Date fecharevocado) {
        this.fecharevocado = fecharevocado;
    }

    public Date getFecha_vigencia() {
        return fecha_vigencia;
    }

    public void setFecha_vigencia(Date fecha_vigencia) {
        this.fecha_vigencia = fecha_vigencia;
    }

    public Integer getNo_acceso() {
        return no_acceso;
    }

    public void setNo_acceso(Integer no_acceso) {
        this.no_acceso = no_acceso;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }
}