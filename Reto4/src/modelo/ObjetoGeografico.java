package modelo;

/**
 *
 * @author alejo
 */
public class ObjetoGeografico {

    // declaracion variables
    private String TipoAgua;
    private String CuerpoAgua;
    private String NombreCuerpoAgua;
    private String TipoDocumento;
    private int ID;
    private float IRCA;

    // constructores
    public ObjetoGeografico() {

    }

    public ObjetoGeografico(String TipoAgua, String CuerpoAgua, String NombreCuerpoAgua, String TipoDocumento, int ID, float IRCA) {
        this.TipoAgua = TipoAgua;
        this.CuerpoAgua = CuerpoAgua;
        this.NombreCuerpoAgua = NombreCuerpoAgua;
        this.TipoDocumento = TipoDocumento;
        this.ID = ID;
        this.IRCA = IRCA;
    }

    // getters and setters
    public String getTipoAgua() {
        return TipoAgua;
    }

    public void setTipoAgua(String TipoAgua) {
        this.TipoAgua = TipoAgua;
    }

    public String getCuerpoAgua() {
        return CuerpoAgua;
    }

    public void setCuerpoAgua(String CuerpoAgua) {
        this.CuerpoAgua = CuerpoAgua;
    }

    public String getNombreCuerpoAgua() {
        return NombreCuerpoAgua;
    }

    public void setNombreCuerpoAgua(String NombreCuerpoAgua) {
        this.NombreCuerpoAgua = NombreCuerpoAgua;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getIRCA() {
        return IRCA;
    }

    public void setIRCA(float IRCA) {
        this.IRCA = IRCA;
    }

}
