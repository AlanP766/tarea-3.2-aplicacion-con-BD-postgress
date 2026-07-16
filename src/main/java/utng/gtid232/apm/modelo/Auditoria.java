package utng.gtid232.apm.modelo;

import java.time.LocalDate;

public class Auditoria {
    private int idAuditoria;
    private int idEmpresa;
    private int idAuditor;
    private LocalDate fechaInicio; 
    private LocalDate fechaFin;
    private String estatus;

    private String nombreEmpresa;
    private String nombreAuditor;

    public Auditoria() {}

    // Constructor para insertar nueva auditoría
    public Auditoria(int idEmpresa, int idAuditor, LocalDate fechaInicio) {
        this.idEmpresa = idEmpresa;
        this.idAuditor = idAuditor;
        this.fechaInicio = fechaInicio;
        this.estatus = "En proceso";
    }

    public Auditoria(int idAuditoria, int idEmpresa, int idAuditor, LocalDate fechaInicio, LocalDate fechaFin, String estatus) {
        this.idAuditoria = idAuditoria;
        this.idEmpresa = idEmpresa;
        this.idAuditor = idAuditor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estatus = estatus;
    }

    public int getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(int idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdAuditor() {
        return idAuditor;
    }

    public void setIdAuditor(int idAuditor) {
        this.idAuditor = idAuditor;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreAuditor() {
        return nombreAuditor;
    }

    public void setNombreAuditor(String nombreAuditor) {
        this.nombreAuditor = nombreAuditor;
    }

    @Override
    public String toString() {
        return "Auditoria #" + idAuditoria + (nombreEmpresa != null ? " - " + nombreEmpresa : "");
    }
}