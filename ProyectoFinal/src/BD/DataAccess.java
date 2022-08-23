/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

/**
 *
 * @author LENOVO
 */
public class DataAccess {
    private int idUser;
    private String nombreUsuario, contrsnaUsuario, confirmarContrsna, nombrePersona, apellidoPersona, numeroTelefono, correo;

    public int getIdUser() {
        return idUser;
    } public void setIdUser(int idUser) {
        this.idUser = idUser;}
 
    public String getNombreUsuario() {
        return nombreUsuario;
    } public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;}

    public String getContrsnaUsuario() {
        return contrsnaUsuario;
    } public void setContrsnaUsuario(String contrsnaUsuario) {
        this.contrsnaUsuario = contrsnaUsuario;}

    public String getNombrePersona() {
        return nombrePersona;
    } public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;}

    public String getApellidoPersona() {
        return apellidoPersona;
    } public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;}

    public String getNumeroTelefono() {
        return numeroTelefono;
    } public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;}

    public String getCorreo() {
        return correo;
    } public void setCorreo(String correo) {
        this.correo = correo;} 
    
    public String getConfirmarContrsna() {
        return confirmarContrsna;
    } public void setConfirmarContrsna(String confirmarContrsna){
        this.confirmarContrsna= confirmarContrsna;
    }
}
