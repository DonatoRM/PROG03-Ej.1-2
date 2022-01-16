/**
 * Definición de la clase del enunciado de la Tarea <code>PROG03</code>
 * @author Donato Ramos Martínez
 */
public class Portatil {
    
    // Atributos de la clase Portatil
    private String marca; // Marca del portátil
    private String cpu; // Nombre de la cpu del portatil
    private int ram; // Cantidad de ram del portátil
    private int hdd; // Cantidad de hdd del portátil
    private boolean usbC; // Indicador de si tiene o no USB el portátil
    
    /**
     * Método que muestra por pantalla los atributos de los objetos intanciados
     * de la clase <code>Portatil</code>
     */
    public void visualiza(){
        System.out.println("Marca: "+marca);
        System.out.println("cpu: "+cpu);
        System.out.println("ram: "+ram);
        System.out.println("hdd: "+hdd);
        System.out.println("usb: "+usbC);
        
        if(usbC==true){
            System.out.println("Tiene puertos usb");
        } else{
            System.out.println("No tiene puertos USB");
        }
    }
    
    /**
     * Setter que nos devuelve la marca del portátil
     * @return Devuelve el valor del atributo marca
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Setter que nos devuelve la cpu del portátil
     * @return Devuelve el valor del atributo cpu
     */
    public String getCpu() {
        return cpu;
    }
    
    /**
     * Setter que nos devuelve la ram del portátil
     * @return Devuelve el valor de la ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * Setter que nos devuelve el hdd del portátil
     * @return Devuelve el valor del hdd
     */
    public int getHdd() {
        return hdd;
    }

    /**
     * Setter que nos devuelve si tiene o no usb del portátil
     * @return Devuelve true o false si tiene o no USB
     */
    public boolean getUsbC() {
        return usbC;
    }

    /**
     * Getter que nos permite cambiar la marca del portatil
     * @param marca Es el texto correspondiente a la marca del portatil
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Getter que nos permite cambiar la cpu del portátil
     * @param cpu Es el texto correspondiente a la cpu del portátil
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * Getter que nos permite cambiar la cantidad de ram del portátil
     * @param ram Es el valor de la ram del portátil
     * @exception RuntimeException Se genera cuando el valor no es válido.
     */
    public void setRam(int ram) {
        if(ram>=0) this.ram = ram;
        else throw new RuntimeException("Valor introducido incorrecto");
    }

    /**
     * Getter que nos permite cambiar la cantidad de hdd del portátil
     * @param hdd Es el valor del hdd del portátil
     * @exception RuntimeException Se genera cuando el valor no es válido.
     */
    public void setHdd(int hdd) {
        if(hdd>=0) this.hdd = hdd;
        else throw new RuntimeException("Valor introducido incorrecto");
    }

    /**
     * Getter que nos permite indicar si el portáil tiene USC
     * @param usbC Indicamos con un booleano si tiene o no USB el portátil
     */
    public void setUsbC(boolean usbC) {
        this.usbC = usbC;
    }

    /**
     * Contructor por defecto
     */
    public Portatil() {
    }

    /**
     * Contructor que permite inicializar todos los atributos a la vez
     * Se controla mediante una excepción si los valores introducido son
     * correctos.
     * @param marca Nombre de la marca del portátil
     * @param cpu Nombre de la cpu del portátil
     * @param ram Cantidad de ram del portátil
     * @param hdd Candidad del hdd del portátil
     * @param usbC Valor booleano que indica si tiene o no USB
     * @exception RuntimeException Es la excepción generada en el caso de que
     * haya algún dato incorrecto.
     */
    public Portatil(String marca, String cpu, int ram, int hdd, boolean usbC) {
        if(ram>=0 && hdd>=0){
            this.marca = marca;
            this.cpu = cpu;
            this.ram = ram;
            this.hdd = hdd;
            this.usbC = usbC;
        } else{
            throw new RuntimeException("Valores el contructor no válidos");
        }
    }
}
