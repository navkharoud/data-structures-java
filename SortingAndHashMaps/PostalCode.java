
/**
 * Navkaran Singh 3119008
 */
public class PostalCode implements Comparable<PostalCode> {

    private String code;
    private String area;
    private String province;
    private double latitude;
    private double longitude;

    public PostalCode() {
        code = "";
        area = "";
        province = "";
        latitude = 0.0;
        longitude = 0.0;
    }

    public PostalCode(String code, String area, String province, double latitude, double longitude) {
        this.code = code;
        this.area = area;
        this.province = province;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * returns code
     *
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * sets the code of the postalcode
     *
     * @param String code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * returns area
     *
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * sets the area of the postalcode
     *
     * @param String area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * returns province of the given postalcode
     *
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * sets the province of the postalcode
     *
     * @param String province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * returns latitude of the given postalcode
     *
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * sets the latitiude of the postalcode
     *
     * @param latitude
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * returns longitude of the given postalcode
     *
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * sets the longitude of the postalcode
     *
     * @param longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return code + " " + area + " " + province + " " + latitude + " " + longitude + '}';
    }

    /**
     * compares postalcodes on basis of codes
     *
     * @param PostalCode o2
     * @return int i
     */
    public int compareTo(PostalCode o2) {
        return this.code.compareTo(o2.code);
    }

}
