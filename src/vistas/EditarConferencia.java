/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Utilerias.Etiqueta;
import Utilerias.Fuentes;
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
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Jesus
 */
public class EditarConferencia extends JFrame  implements ActionListener
{
    
    private final HashMap<String, JTextField> campos;
    
    private final ButtonGroup grupo = new ButtonGroup();
    private final JRadioButton si = new JRadioButton("Si");
    private final JRadioButton no = new JRadioButton("No");
    
    private final int idConfe;
    
    public EditarConferencia(int idConfe) 
    {
        super();
        campos = new HashMap<>();
        this.idConfe = idConfe;
        configura();
    }    
    
    private void configura()
    {
        setTitle("Conferencias .net");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false); 
        
        JButton registrar = new JButton("Actualizar");
        registrar.addActionListener((ActionEvent e) -> 
        {
            //TODO: actualizar conferencia
        });
        
        JButton delete = new JButton("Eliminar");
        delete.addActionListener((ActionEvent e) -> 
        {
            //TODO: eliminar conferencia
        });
        
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
         
        // <editor-fold defaultstate="collapsed" desc="Botones Radio">
        grupo.add(si);
        grupo.add(no);
        si.setFont(Fuentes.normal);
        no.setFont(Fuentes.normal);
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
                .addGroup
                (
                        layout.createParallelGroup()
                        .addComponent(registrar)
                        .addComponent(delete)
                )
                
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
                .addGroup
                (
                        layout.createSequentialGroup()
                        .addComponent(registrar)
                        .addComponent(delete)
                )
        );
        
        setLayout(layout);
        this.pack();
         //</editor-fold>
         
         poblar();
    }
    
    /**
     * TODO: Este metodo debe settear todos los campos con los correspondientes al id
     */
    private void poblar()
    {
        //por ejemplo
        campos.get("nombreConfe").setText("Saludos");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
