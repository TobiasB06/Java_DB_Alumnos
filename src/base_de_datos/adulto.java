/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base_de_datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class adulto extends javax.swing.JFrame {
    Conexion conexion = new Conexion(); 
    Connection cnx = conexion.Conectar();
    /**
     * Creates new form adulto
     */
    public adulto() {    
       initComponents();
       cargarDatos();
    }
    private void cargarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) Tabla_adultos.getModel();
        modelo.setRowCount(0);
        try {
            String query = "SELECT ID_alumnos,Nombre, Apellido, DNI, Nacionalidad, Direccion, Telefono FROM adulto";
            PreparedStatement pst = cnx.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                String ID_alumnos =rs.getString("ID_alumnos");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                String dni = rs.getString("DNI");
                String nacionalidad = rs.getString("Nacionalidad");
                String domicilio = rs.getString("Direccion");
                String telefono = rs.getString("Telefono");
                modelo.addRow(new Object[] {ID_alumnos,nombre, apellido, dni, nacionalidad, domicilio, telefono});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos desde la base de datos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Apellido_entry = new javax.swing.JTextPane();
        Nombre_entry = new javax.swing.JTextPane();
        Dom_entry = new javax.swing.JTextPane();
        DNI_entry = new javax.swing.JTextPane();
        Telefono_entry = new javax.swing.JTextPane();
        NAC__entry = new javax.swing.JTextPane();
        Agregar_boton = new javax.swing.JButton();
        Modificar_boton = new javax.swing.JButton();
        Eliminar_boton = new javax.swing.JButton();
        Imprimir_boton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Id_alumno_entry = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_adultos = new javax.swing.JTable();

        jScrollPane4.setViewportView(jTextPane3);

        jScrollPane6.setViewportView(jTextPane5);

        jScrollPane9.setViewportView(jTextPane8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(0, 0, 51));

        jButton25.setBackground(new java.awt.Color(0, 102, 153));
        jButton25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton25.setForeground(new java.awt.Color(204, 204, 204));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hombre.png"))); // NOI18N
        jButton25.setText("Adultos");
        jButton25.setBorder(null);
        jButton25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jButton26.setBackground(new java.awt.Color(0, 102, 153));
        jButton26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton26.setForeground(new java.awt.Color(204, 204, 204));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alumno.png"))); // NOI18N
        jButton26.setText("Alumnos");
        jButton26.setBorder(null);
        jButton26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(0, 102, 153));
        jButton27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton27.setForeground(new java.awt.Color(204, 204, 204));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tesis.png"))); // NOI18N
        jButton27.setText("Matricula");
        jButton27.setBorder(null);
        jButton27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jButton28.setBackground(new java.awt.Color(0, 102, 153));
        jButton28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton28.setForeground(new java.awt.Color(204, 204, 204));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        jButton28.setText("MENU");
        jButton28.setBorder(null);
        jButton28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Sistema");

        jButton29.setBackground(new java.awt.Color(0, 0, 51));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion (1).png"))); // NOI18N
        jButton29.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("6°5");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        jLabel3.setText("Nombre");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Apellido/s");
        jLabel5.setToolTipText("");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DNI");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nacionalidad");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Domicilio");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Telefono");

        Agregar_boton.setBackground(new java.awt.Color(0, 102, 153));
        Agregar_boton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Agregar_boton.setForeground(new java.awt.Color(204, 204, 204));
        Agregar_boton.setText("Agregar");
        Agregar_boton.setBorder(null);
        Agregar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_botonActionPerformed(evt);
            }
        });

        Modificar_boton.setBackground(new java.awt.Color(0, 102, 153));
        Modificar_boton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Modificar_boton.setForeground(new java.awt.Color(204, 204, 204));
        Modificar_boton.setText("Modificar");
        Modificar_boton.setBorder(null);
        Modificar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_botonActionPerformed(evt);
            }
        });

        Eliminar_boton.setBackground(new java.awt.Color(255, 0, 0));
        Eliminar_boton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Eliminar_boton.setForeground(new java.awt.Color(204, 204, 204));
        Eliminar_boton.setText("Eliminar");
        Eliminar_boton.setBorder(null);
        Eliminar_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_botonActionPerformed(evt);
            }
        });

        Imprimir_boton.setBackground(new java.awt.Color(0, 102, 153));
        Imprimir_boton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Imprimir_boton.setForeground(new java.awt.Color(204, 204, 204));
        Imprimir_boton.setText("Imprimir");
        Imprimir_boton.setToolTipText("");
        Imprimir_boton.setBorder(null);
        Imprimir_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir_botonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID Alumno");

        Id_alumno_entry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_alumno_entryActionPerformed(evt);
            }
        });

        Tabla_adultos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Alumno", "Nombre", "Apellido", "DNI", "Nacionalidad", "Domicilio", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_adultos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Id_alumno_entry, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Nombre_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Apellido_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DNI_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NAC__entry, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Dom_entry)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Telefono_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 21, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(613, 613, 613)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Modificar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Agregar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Eliminar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Imprimir_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Dom_entry)
                    .addComponent(NAC__entry)
                    .addComponent(Telefono_entry)
                    .addComponent(DNI_entry)
                    .addComponent(Apellido_entry)
                    .addComponent(Nombre_entry)
                    .addComponent(Id_alumno_entry, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(240, Short.MAX_VALUE)
                    .addComponent(Agregar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(Modificar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(Imprimir_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(Eliminar_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(79, 79, 79)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton29))
                            .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton29)
                .addGap(5, 5, 5)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel16)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Agregar_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_botonActionPerformed
            String id_alumnos=Id_alumno_entry.getText();
            String nombre = Nombre_entry.getText();
            String apellido = Apellido_entry.getText();
            String dni = DNI_entry.getText();
            String nacionalidad = NAC__entry.getText();
            String domicilio = Dom_entry.getText();
            String telefono = Telefono_entry.getText();
            
            String sql = "INSERT INTO adulto(id_alumnos,Nombre, Apellido, DNI, Nacionalidad, Direccion, Telefono) VALUES(?,?,?,?,?,?,?)";
                try{
                    PreparedStatement pst = cnx.prepareStatement(sql);
                    pst.setString(1, id_alumnos);
                    pst.setString(2, nombre);
                    pst.setString(3, apellido);
                    pst.setString(4, dni);
                    pst.setString(5, nacionalidad);
                    pst.setString(6, domicilio);
                    pst.setString(7, telefono);
                    int resultado = pst.executeUpdate();
                    if (resultado > 0) {
                            JOptionPane.showMessageDialog(null, "Registro agregado correctamente");
                            cargarDatos();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "No se pudo agregar el registro");
                    }
                } catch (SQLException e) {
                            if (e.getErrorCode() == 1062) {
                                JOptionPane.showMessageDialog(null, "El DNI ya está registrado en la base de datos");
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al agregar el registro: " + e.getMessage());
                            }
                }

    }//GEN-LAST:event_Agregar_botonActionPerformed

    private void Modificar_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_botonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificar_botonActionPerformed

    private void Eliminar_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_botonActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) Tabla_adultos.getModel();
        int filaSeleccionada = Tabla_adultos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
            return;
        }

        String dni = modelo.getValueAt(filaSeleccionada, 3).toString();

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este registro?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM adulto WHERE DNI = ?";
                PreparedStatement ps = cnx.prepareStatement(sql);
                ps.setString(1, dni);

                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                    cargarDatos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_Eliminar_botonActionPerformed

    private void Imprimir_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir_botonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Imprimir_botonActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void Id_alumno_entryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_alumno_entryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Id_alumno_entryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adulto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adulto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adulto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adulto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adulto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_boton;
    private javax.swing.JTextPane Apellido_entry;
    private javax.swing.JTextPane DNI_entry;
    private javax.swing.JTextPane Dom_entry;
    private javax.swing.JButton Eliminar_boton;
    private javax.swing.JTextField Id_alumno_entry;
    private javax.swing.JButton Imprimir_boton;
    private javax.swing.JButton Modificar_boton;
    private javax.swing.JTextPane NAC__entry;
    private javax.swing.JTextPane Nombre_entry;
    private javax.swing.JTable Tabla_adultos;
    private javax.swing.JTextPane Telefono_entry;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane8;
    // End of variables declaration//GEN-END:variables
}
