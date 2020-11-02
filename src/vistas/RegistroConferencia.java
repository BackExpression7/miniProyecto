
package vistas;
import Utilerias.Etiqueta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Jesus
 */
public class RegistroConferencia extends JFrame implements ActionListener
{
    private int idUsuario;
    
    // hash map que tiene todos los campos de texto, para ver sus keys, estan en 
    //el metodo configuracion
    private final HashMap<String, JTextField> campos;
    
    private final ButtonGroup grupo = new ButtonGroup();
    private final JRadioButton si = new JRadioButton("Si");
    private final JRadioButton no = new JRadioButton("No");

    /**
     * Este constructor recibe el id del usuario que registra la conferencia, el cual
     * debe ser insertado como asistente
     * @param idUsuario id del usuario que esta registrando la contraseña
     */
    public RegistroConferencia(int idUsuario) 
    {
        super();
        this.idUsuario = idUsuario;
        campos = new HashMap<>();
        configura();
    }

    private void configura() 
    {
        setTitle("Conferencias .net");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false); 
        
        JButton registrar = new JButton("Registrar");
        registrar.addActionListener(this);
        
        // <editor-fold defaultstate="collapsed" desc="Etiquetas">
        HashMap<String, JLabel> etiquetas = new HashMap<>();
        etiquetas.put("titulo", new Etiqueta("Registro de Conferencias", "titulo"));
        etiquetas.put("nombre1", new Etiqueta("Presentador 1"));
        etiquetas.put("nombre2", new Etiqueta("Presentador 2"));
        etiquetas.put("nombre3", new Etiqueta("Presentador 3"));
        etiquetas.put("nombreConfe", new Etiqueta("Nombre de la conferencia"));
        etiquetas.put("tieneCosto", new Etiqueta("Tendra costo?"));
        etiquetas.put("costo", new Etiqueta("Costo"));
        etiquetas.put("capacidad", new Etiqueta("Capacidad"));
        etiquetas.put("fecha", new Etiqueta("Fecha: "));
        etiquetas.put("slash", new Etiqueta("/"));
         //</editor-fold>
         
        // <editor-fold defaultstate="collapsed" desc="Grupos">
        grupo.add(si);
        grupo.add(no);
         //</editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Campos de texto">
        campos.put("nombrep1",new JTextField());
        campos.put("nombrep2", new JTextField());
        campos.put("nombrep3", new JTextField());
        campos.put("nombreConfe", new JTextField());
        campos.put("costo", new JTextField());
        campos.put("capacidad", new JTextField());
        campos.put("dia", new JTextField());
        campos.put("mes", new JTextField());
        campos.put("anio", new JTextField());
         //</editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Layout">
        GroupLayout layout = new GroupLayout(this.getContentPane());
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);
        
        layout.setVerticalGroup
        (
                layout.createSequentialGroup()
                .addComponent(etiquetas.get("titulo"))
                .addGroup
                (
                        layout.createParallelGroup()
                        .addComponent(etiquetas.get("nombre1"))
                        .addComponent(campos.get("nombrep1"))
                )
                .addGroup
                (
                        layout.createParallelGroup()
                        .addComponent(etiquetas.get("nombre2"))
                        .addComponent(campos.get("nombrep2"))
                )
                .addGroup
                (
                        layout.createParallelGroup()
                        .addComponent(etiquetas.get("nombre3"))
                        .addComponent(campos.get("nombrep3"))
                )
                .addGroup
                (
                        layout.createParallelGroup()
                        .addComponent(etiquetas.get("nombreConfe"))
                        .addComponent(campos.get("nombreConfe"))
                )
                .addGroup
                (
                        layout.createParallelGroup()
                        .addComponent(etiquetas.get("tieneCosto"))
                        .addComponent(si)
                        .addComponent(no)
                )
                .addGroup
                (
                        layout.createParallelGroup()
                        .addComponent(etiquetas.get("costo"))
                        .addComponent(campos.get("costo"))
                )
                .addGroup
                (
                        layout.createParallelGroup()
                        .addComponent(etiquetas.get("capacidad"))
                        .addComponent(campos.get("capacidad"))
                )
                .addGroup
                (
                        layout.createParallelGroup()
                        .addComponent(etiquetas.get("fecha"))
                        .addComponent(campos.get("dia"))
                        .addComponent(etiquetas.get("slash"))
                        .addComponent(campos.get("mes"))
                        .addComponent(etiquetas.get("slash"))
                        .addComponent(campos.get("anio"))
                )
                .addComponent(registrar)
        );

        layout.setHorizontalGroup
        (
                layout.createParallelGroup()
                .addComponent(etiquetas.get("titulo"))
                .addGroup
                (
                        layout.createSequentialGroup()
                        .addComponent(etiquetas.get("nombre1"))
                        .addComponent(campos.get("nombrep1"))
                )
                .addGroup
                (
                        layout.createSequentialGroup()
                        .addComponent(etiquetas.get("nombre2"))
                        .addComponent(campos.get("nombrep2"))
                )
                .addGroup
                (
                        layout.createSequentialGroup()
                        .addComponent(etiquetas.get("nombre3"))
                        .addComponent(campos.get("nombrep3"))
                )
                .addGroup
                (
                        layout.createSequentialGroup()
                        .addComponent(etiquetas.get("nombreConfe"))
                        .addComponent(campos.get("nombreConfe"),200,200,200)
                )
                .addGroup
                (
                        layout.createSequentialGroup()
                        .addComponent(etiquetas.get("tieneCosto"))
                        .addComponent(si)
                        .addComponent(no)
                )
                .addGroup
                (
                        layout.createSequentialGroup()
                        .addComponent(etiquetas.get("costo"))
                        .addComponent(campos.get("costo"),60,60,60)
                )
                .addGroup
                (
                        layout.createSequentialGroup()
                        .addComponent(etiquetas.get("capacidad"))
                        .addComponent(campos.get("capacidad"),60,60,60)
                )
                .addGroup
                (
                        layout.createSequentialGroup()
                        .addComponent(etiquetas.get("fecha"))
                        .addComponent(campos.get("dia"),40,40,40)
                        .addComponent(etiquetas.get("slash"))
                        .addComponent(campos.get("mes"),40,40,40)
                        .addComponent(etiquetas.get("slash"))
                        .addComponent(campos.get("anio"),40,40,40)
                )
                .addComponent(registrar)
        );
        
        setLayout(layout);
        this.pack();
         //</editor-fold>
    }

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        System.out.println("Registrado :)");
    }


    
    
}
