/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdmin;

import Business.EcoSystem;
import Business.Network.Network;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indianrenters
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdmin
     */
    JPanel userProcessContainer;
    EcoSystem system;
    public SystemAdminWorkArea(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTableNetwork();
        populateComboNetwork();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSystemAdminWA = new javax.swing.JPanel();
        pnlSystemAdminView = new javax.swing.JPanel();
        lblSystemAdmin = new javax.swing.JLabel();
        pnlSystemAdminWorkArea = new javax.swing.JPanel();
        tabViewPanes = new javax.swing.JTabbedPane();
        pnlProfile = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlManageNetwork = new javax.swing.JPanel();
        tblManageNetwork = new javax.swing.JScrollPane();
        networkTable = new javax.swing.JTable();
        txtAddNetwork = new javax.swing.JTextField();
        lblAddNetwork = new javax.swing.JLabel();
        btnAddNetwork = new javax.swing.JButton();
        pnlManageEnterprise = new javax.swing.JPanel();
        cmbNetwork = new javax.swing.JComboBox<>();
        lblSelectNetwork = new javax.swing.JLabel();
        ScrPaneManageEnterprise = new javax.swing.JScrollPane();
        tblManageEnterprise = new javax.swing.JTable();
        lblEnterpriseType = new javax.swing.JLabel();
        cmbEnterpriseType = new javax.swing.JComboBox<>();
        lblEnterpriseName = new javax.swing.JLabel();
        txtEnterpriseName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        pnlManageOrganisation = new javax.swing.JPanel();
        lblOrganisationType = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblManageOrganisations = new javax.swing.JTable();
        lblSelectNewtorkOrg = new javax.swing.JLabel();
        cmbSelectNetworkOrg = new javax.swing.JComboBox<>();
        btnUpdateOrg = new javax.swing.JButton();
        btnUpdateSubmit = new javax.swing.JButton();
        txtOrganisationName = new javax.swing.JTextField();
        lblOrganisationName = new javax.swing.JLabel();
        cmbOrgansiationType = new javax.swing.JComboBox<>();
        cmbSelectEnterpriseOrg = new javax.swing.JComboBox<>();
        lblSelectEnterpriseOrg = new javax.swing.JLabel();
        pnlUser = new javax.swing.JPanel();
        ScrPaneManageUsers = new javax.swing.JScrollPane();
        tblManageUsers = new javax.swing.JTable();

        pnlSystemAdminView.setBackground(new java.awt.Color(0, 204, 204));

        lblSystemAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblSystemAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblSystemAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSystemAdmin.setText("System Admin's Work Area");

        javax.swing.GroupLayout pnlSystemAdminViewLayout = new javax.swing.GroupLayout(pnlSystemAdminView);
        pnlSystemAdminView.setLayout(pnlSystemAdminViewLayout);
        pnlSystemAdminViewLayout.setHorizontalGroup(
            pnlSystemAdminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSystemAdminViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSystemAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSystemAdminViewLayout.setVerticalGroup(
            pnlSystemAdminViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSystemAdminViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSystemAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabViewPanes.setBackground(java.awt.Color.lightGray);

        pnlProfile.setBackground(new java.awt.Color(255, 255, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnlProfileLayout = new javax.swing.GroupLayout(pnlProfile);
        pnlProfile.setLayout(pnlProfileLayout);
        pnlProfileLayout.setHorizontalGroup(
            pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfileLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );
        pnlProfileLayout.setVerticalGroup(
            pnlProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfileLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        tabViewPanes.addTab("View Stats", pnlProfile);

        pnlManageNetwork.setBackground(new java.awt.Color(234, 253, 234));

        networkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Network ID", "Network Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManageNetwork.setViewportView(networkTable);

        txtAddNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddNetworkActionPerformed(evt);
            }
        });

        lblAddNetwork.setText("Add Network Name");

        btnAddNetwork.setText("Submit");
        btnAddNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNetworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlManageNetworkLayout = new javax.swing.GroupLayout(pnlManageNetwork);
        pnlManageNetwork.setLayout(pnlManageNetworkLayout);
        pnlManageNetworkLayout.setHorizontalGroup(
            pnlManageNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageNetworkLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(pnlManageNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManageNetworkLayout.createSequentialGroup()
                        .addComponent(tblManageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManageNetworkLayout.createSequentialGroup()
                        .addComponent(lblAddNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtAddNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(252, 252, 252))))
            .addGroup(pnlManageNetworkLayout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(btnAddNetwork)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlManageNetworkLayout.setVerticalGroup(
            pnlManageNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageNetworkLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(tblManageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(pnlManageNetworkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddNetwork))
                .addGap(58, 58, 58)
                .addComponent(btnAddNetwork)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        tabViewPanes.addTab("Manage Network", pnlManageNetwork);

        pnlManageEnterprise.setBackground(new java.awt.Color(255, 230, 255));

        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "California", "New York", "Massachussetts" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });

        lblSelectNetwork.setText("Select Network");

        tblManageEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise ID", "Enterprise", "Enterprise Type"
            }
        ));
        ScrPaneManageEnterprise.setViewportView(tblManageEnterprise);

        lblEnterpriseType.setText("Enterprise Type");

        cmbEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblEnterpriseName.setText("Enterprise Name");

        txtEnterpriseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterpriseNameActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");

        btnUpdate.setText("Update");

        javax.swing.GroupLayout pnlManageEnterpriseLayout = new javax.swing.GroupLayout(pnlManageEnterprise);
        pnlManageEnterprise.setLayout(pnlManageEnterpriseLayout);
        pnlManageEnterpriseLayout.setHorizontalGroup(
            pnlManageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageEnterpriseLayout.createSequentialGroup()
                .addGroup(pnlManageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlManageEnterpriseLayout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubmit))
                    .addGroup(pnlManageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlManageEnterpriseLayout.createSequentialGroup()
                            .addGap(265, 265, 265)
                            .addComponent(lblSelectNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlManageEnterpriseLayout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addComponent(ScrPaneManageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlManageEnterpriseLayout.createSequentialGroup()
                            .addGap(249, 249, 249)
                            .addGroup(pnlManageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblEnterpriseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addGroup(pnlManageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEnterpriseName)
                                .addComponent(cmbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        pnlManageEnterpriseLayout.setVerticalGroup(
            pnlManageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageEnterpriseLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlManageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectNetwork))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrPaneManageEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlManageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSubmit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(pnlManageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseType)
                    .addComponent(cmbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlManageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseName)
                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        tabViewPanes.addTab("Manage Enterprise", pnlManageEnterprise);

        pnlManageOrganisation.setBackground(new java.awt.Color(204, 204, 255));

        lblOrganisationType.setText("Organisation Type");

        tblManageOrganisations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Organisation ID", "Organisation Name", "Organisation Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblManageOrganisations);

        lblSelectNewtorkOrg.setText("Select Network");

        cmbSelectNetworkOrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "California", "New York", "Massachussetts" }));

        btnUpdateOrg.setText("Update");
        btnUpdateOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOrgActionPerformed(evt);
            }
        });

        btnUpdateSubmit.setText("Submit");

        txtOrganisationName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrganisationNameActionPerformed(evt);
            }
        });

        lblOrganisationName.setText("Organisation Name");

        cmbOrgansiationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbSelectEnterpriseOrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supply Unit", "Transportation Unit" }));

        lblSelectEnterpriseOrg.setText("Select Enterprise");

        javax.swing.GroupLayout pnlManageOrganisationLayout = new javax.swing.GroupLayout(pnlManageOrganisation);
        pnlManageOrganisation.setLayout(pnlManageOrganisationLayout);
        pnlManageOrganisationLayout.setHorizontalGroup(
            pnlManageOrganisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageOrganisationLayout.createSequentialGroup()
                .addGroup(pnlManageOrganisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlManageOrganisationLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(pnlManageOrganisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlManageOrganisationLayout.createSequentialGroup()
                                .addComponent(btnUpdateOrg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateSubmit))
                            .addGroup(pnlManageOrganisationLayout.createSequentialGroup()
                                .addComponent(lblSelectNewtorkOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSelectNetworkOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(lblSelectEnterpriseOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSelectEnterpriseOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlManageOrganisationLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(pnlManageOrganisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlManageOrganisationLayout.createSequentialGroup()
                                .addComponent(lblOrganisationName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(txtOrganisationName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlManageOrganisationLayout.createSequentialGroup()
                                .addComponent(lblOrganisationType, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(cmbOrgansiationType, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        pnlManageOrganisationLayout.setVerticalGroup(
            pnlManageOrganisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlManageOrganisationLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlManageOrganisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSelectNetworkOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectNewtorkOrg)
                    .addComponent(cmbSelectEnterpriseOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectEnterpriseOrg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlManageOrganisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateOrg)
                    .addComponent(btnUpdateSubmit))
                .addGap(27, 27, 27)
                .addGroup(pnlManageOrganisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganisationType)
                    .addComponent(cmbOrgansiationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlManageOrganisationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganisationName)
                    .addComponent(txtOrganisationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tabViewPanes.addTab("Manage Organisations", pnlManageOrganisation);

        pnlUser.setBackground(new java.awt.Color(229, 252, 253));

        tblManageUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "User ID", "User Name", "Password"
            }
        ));
        ScrPaneManageUsers.setViewportView(tblManageUsers);

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(ScrPaneManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(446, Short.MAX_VALUE))
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ScrPaneManageUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        tabViewPanes.addTab("Manage Users", pnlUser);

        javax.swing.GroupLayout pnlSystemAdminWorkAreaLayout = new javax.swing.GroupLayout(pnlSystemAdminWorkArea);
        pnlSystemAdminWorkArea.setLayout(pnlSystemAdminWorkAreaLayout);
        pnlSystemAdminWorkAreaLayout.setHorizontalGroup(
            pnlSystemAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSystemAdminWorkAreaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tabViewPanes, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlSystemAdminWorkAreaLayout.setVerticalGroup(
            pnlSystemAdminWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSystemAdminWorkAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabViewPanes, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSystemAdminWALayout = new javax.swing.GroupLayout(pnlSystemAdminWA);
        pnlSystemAdminWA.setLayout(pnlSystemAdminWALayout);
        pnlSystemAdminWALayout.setHorizontalGroup(
            pnlSystemAdminWALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSystemAdminWALayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(pnlSystemAdminWALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSystemAdminWALayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pnlSystemAdminWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlSystemAdminView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        pnlSystemAdminWALayout.setVerticalGroup(
            pnlSystemAdminWALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSystemAdminWALayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlSystemAdminView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnlSystemAdminWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSystemAdminWA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSystemAdminWA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
     private void populateTableNetwork(){
     DefaultTableModel model = (DefaultTableModel) networkTable.getModel();
     model.setRowCount(0);
      for(Network n :system.getNetworkList()){
          Object [] row = new Object[2];
             row[0] = n.getNetworkId();
             row[1] = n;
              model.addRow(row);
              
        }
    }
    private void populateComboNetwork(){
    cmbNetwork.removeAllItems();
    cmbNetwork.addItem("Select");
    cmbNetwork.setSelectedItem("Select"); 
       for(Network n :system.getNetworkList()){
             cmbNetwork.addItem(n.getName());   
         }
    } 
    private void txtAddNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddNetworkActionPerformed

    private void txtEnterpriseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterpriseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterpriseNameActionPerformed

    private void txtOrganisationNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrganisationNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrganisationNameActionPerformed

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNetworkActionPerformed

    private void btnUpdateOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateOrgActionPerformed

    private void btnAddNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNetworkActionPerformed
        // TODO add your handling code here:
        String networkName = txtAddNetwork.getText();
        system.addNetwork().setName(networkName);
        populateTableNetwork();
        
    }//GEN-LAST:event_btnAddNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrPaneManageEnterprise;
    private javax.swing.JScrollPane ScrPaneManageUsers;
    private javax.swing.JButton btnAddNetwork;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateOrg;
    private javax.swing.JButton btnUpdateSubmit;
    private javax.swing.JComboBox<String> cmbEnterpriseType;
    private javax.swing.JComboBox<String> cmbNetwork;
    private javax.swing.JComboBox<String> cmbOrgansiationType;
    private javax.swing.JComboBox<String> cmbSelectEnterpriseOrg;
    private javax.swing.JComboBox<String> cmbSelectNetworkOrg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAddNetwork;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblOrganisationName;
    private javax.swing.JLabel lblOrganisationType;
    private javax.swing.JLabel lblSelectEnterpriseOrg;
    private javax.swing.JLabel lblSelectNetwork;
    private javax.swing.JLabel lblSelectNewtorkOrg;
    private javax.swing.JLabel lblSystemAdmin;
    private javax.swing.JTable networkTable;
    private javax.swing.JPanel pnlManageEnterprise;
    private javax.swing.JPanel pnlManageNetwork;
    private javax.swing.JPanel pnlManageOrganisation;
    private javax.swing.JPanel pnlProfile;
    private javax.swing.JPanel pnlSystemAdminView;
    private javax.swing.JPanel pnlSystemAdminWA;
    private javax.swing.JPanel pnlSystemAdminWorkArea;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JTabbedPane tabViewPanes;
    private javax.swing.JTable tblManageEnterprise;
    private javax.swing.JScrollPane tblManageNetwork;
    private javax.swing.JTable tblManageOrganisations;
    private javax.swing.JTable tblManageUsers;
    private javax.swing.JTextField txtAddNetwork;
    private javax.swing.JTextField txtEnterpriseName;
    private javax.swing.JTextField txtOrganisationName;
    // End of variables declaration//GEN-END:variables
}
