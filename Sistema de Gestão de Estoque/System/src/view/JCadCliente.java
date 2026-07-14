package view;

import conexao.ClienteDAO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.MCadCliente;



public class JCadCliente extends javax.swing.JFrame {
    private int indice = 0;
    private Boolean valCRUD = false;//variavel para verificar se o crud foi realizado
    ClienteDAO selectClientes = new ClienteDAO();
    List<MCadCliente> clientesCad = new ArrayList<>();
    char confirmAcao = 'n';
    
    /**
     * Creates new form Jprincipal2
     */
    public JCadCliente() {
        initComponents();
// Layout de abertura, campos travados
        txtIdCliente.setEditable(false);
        txtRazaoSocial.setEditable(false);
        txtApelido.setEditable(false);
        txtCpfCnpj.setEditable(false);
        txtTelefone.setEditable(false);
        txtEmail.setEditable(false);
        txtCep.setEditable(false);
        txtEndereco.setEditable(false);
        txtBairro.setEditable(false);
        txtNumero.setEditable(false);
        txtCidade.setEditable(false);
        cbPais.setEnabled(false);
        cbUF.setEnabled(false);
        cbxDesativado.setEnabled(false); // Caso tenha checkbox para status do cliente

        btConfirmar.setVisible(false); // Botão confirmar cadastro
        btVoltar.setVisible(false);    // Botão sair do cadastro

// Inicializar começando da posição zero
        clientesCad = selectClientes.buscarCliente();

        txtIdCliente.setText(Integer.toString(clientesCad.get(indice).getIdCliente()));
        txtRazaoSocial.setText(clientesCad.get(indice).getRazaoSocial());
        txtApelido.setText(clientesCad.get(indice).getApelido());
        txtCpfCnpj.setText(clientesCad.get(indice).getCpfCnpj());
        txtTelefone.setText(clientesCad.get(indice).getTelefone());
        txtEmail.setText(clientesCad.get(indice).getEmail());
        txtCep.setText(clientesCad.get(indice).getCep());
        txtEndereco.setText(clientesCad.get(indice).getEndereco());
        txtBairro.setText(clientesCad.get(indice).getBairro());
        txtNumero.setText(clientesCad.get(indice).getNumero());
        txtCidade.setText(clientesCad.get(indice).getCidade());
        cbPais.setSelectedItem(clientesCad.get(indice).getPais());
        cbUF.setSelectedItem(clientesCad.get(indice).getUf());
        // Caso tenha campo ou checkbox para status do cliente, ajustar aqui
        // Exemplo: cbxDesativado.setSelected(!clientesCad.get(indice).isAtivo());

        
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRazaoSocial = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtEndereco = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxDesativado = new javax.swing.JCheckBox();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtEmail = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        btCadCliente = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        cbUF = new javax.swing.JComboBox<>();
        btAnterior = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtIdCliente = new javax.swing.JTextPane();
        btConfirmar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btReplicar = new javax.swing.JButton();
        btPrimeiro = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        lObrigatorioDescricao = new javax.swing.JLabel();
        lObrigatorioCategoria1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtApelido = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCpfCnpj = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtBairro = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtNumero = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtCidade = new javax.swing.JTextPane();
        Cidade = new javax.swing.JLabel();
        cbPais = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(54, 85, 115));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(txtRazaoSocial);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Razão Social");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");

        jScrollPane4.setViewportView(txtEndereco);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Unidade");

        cbxDesativado.setForeground(new java.awt.Color(255, 255, 255));
        cbxDesativado.setText("Desativar");
        cbxDesativado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDesativadoActionPerformed(evt);
            }
        });

        jScrollPane8.setViewportView(txtEmail);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("E-mail");

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout_24x24.png"))); // NOI18N
        btSair.setToolTipText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/new_client_24x24.png"))); // NOI18N
        btCadCliente.setToolTipText("Cadastrar novo produto");
        btCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadClienteActionPerformed(evt);
            }
        });

        btProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow-right2.png"))); // NOI18N
        btProximo.setToolTipText("Proximo produto");
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });
        btProximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btProximoKeyPressed(evt);
            }
        });

        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUFActionPerformed(evt);
            }
        });

        btAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow-left2.png"))); // NOI18N
        btAnterior.setToolTipText("Produto anterior");
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });
        btAnterior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btAnteriorKeyPressed(evt);
            }
        });

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        btAlterar.setToolTipText("Alterar produto");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trash-can.png"))); // NOI18N
        btExcluir.setToolTipText("Excluir produto");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(txtIdCliente);

        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btReplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/replic.png"))); // NOI18N
        btReplicar.setToolTipText("Replicar produto");
        btReplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReplicarActionPerformed(evt);
            }
        });

        btPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow-first.png"))); // NOI18N
        btPrimeiro.setToolTipText("Primeiro produto");
        btPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimeiroActionPerformed(evt);
            }
        });
        btPrimeiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btPrimeiroKeyPressed(evt);
            }
        });

        btUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow-last.png"))); // NOI18N
        btUltimo.setToolTipText("Proximo produto");
        btUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUltimoActionPerformed(evt);
            }
        });
        btUltimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btUltimoKeyPressed(evt);
            }
        });

        lObrigatorioDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lObrigatorioDescricao.setForeground(new java.awt.Color(255, 51, 51));
        lObrigatorioDescricao.setText("*");
        lObrigatorioDescricao.setToolTipText("Obrigatorio");

        lObrigatorioCategoria1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lObrigatorioCategoria1.setForeground(new java.awt.Color(255, 51, 51));
        lObrigatorioCategoria1.setText("*");
        lObrigatorioCategoria1.setToolTipText("Obrigatorio");

        jScrollPane2.setViewportView(txtApelido);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apelido");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefone/Celular");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CPF/CNPJ");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CEP");

        jScrollPane6.setViewportView(txtBairro);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bairro");

        jScrollPane10.setViewportView(txtNumero);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nº");

        jScrollPane11.setViewportView(txtCidade);

        Cidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cidade.setForeground(new java.awt.Color(255, 255, 255));
        Cidade.setText("Cidade");

        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afeganistão", "África do Sul", "Albânia", "Alemanha", "Andorra", "Angola", "Antígua e Barbuda", "Arábia Saudita", "Argélia", "Argentina", "Armênia", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Bélgica", "Belize", "Benim", "Bielorrússia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burkina Faso", "Burundi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Chade", "Chile", "China", "Chipre", "Colômbia", "Comores", "Congo", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Dinamarca", "Djibuti", "Dominica", "Egito", "El Salvador", "Emirados Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovênia", "Espanha", "Estados Unidos", "Estônia", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Geórgia", "Gana", "Grécia", "Granada", "Guatemala", "Guiana", "Guiné", "Guiné-Bissau", "Guiné Equatorial", "Haiti", "Honduras", "Hungria", "Iêmen", "Índia", "Indonésia", "Irã", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kuwait", "Laos", "Lesoto", "Letônia", "Líbano", "Libéria", "Líbia", "Liechtenstein", "Lituânia", "Luxemburgo", "Madagascar", "Malásia", "Malauí", "Maldivas", "Mali", "Malta", "Marrocos", "Maurícia", "Mauritânia", "México", "Micronésia", "Moçambique", "Moldávia", "Mônaco", "Mongólia", "Montenegro", "Namíbia", "Nauru", "Nepal", "Nicarágua", "Níger", "Nigéria", "Noruega", "Nova Zelândia", "Omã", "Países Baixos", "Palau", "Panamá", "Papua Nova Guiné", "Paquistão", "Paraguai", "Peru", "Filipinas", "Polônia", "Portugal", "Quênia", "Quirguistão", "Reino Unido", "República Centro-Africana", "República Checa", "República Democrática do Congo", "República Dominicana", "Romênia", "Ruanda", "Rússia", "São Cristóvão e Névis", "São Tomé e Príncipe", "São Vicente e Granadinas", "Samoa", "San Marino", "Santa Lúcia", "Senegal", "Serra Leoa", "Sérvia", "Seychelles", "Singapura", "Síria", "Somália", "Sri Lanka", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Tailândia", "Tajiquistão", "Tanzânia", "Timor-Leste", "Togo", "Tonga", "Trinidad e Tobago", "Tunísia", "Turcomenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "Uruguai", "Uzbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietnã", "Zâmbia", "Zimbábue" }));
        cbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaisActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Pais");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Cadastro de Cliente");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cad user_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lObrigatorioDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lObrigatorioCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btReplicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(cbxDesativado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtCep, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jScrollPane8)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel13))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btConfirmar))
                                    .addComponent(jScrollPane10))
                                .addGap(18, 18, 18)
                                .addComponent(btVoltar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Cidade))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(cbPais, 0, 0, Short.MAX_VALUE)))
                                    .addComponent(btPrimeiro))
                                .addGap(18, 18, 18)
                                .addComponent(btAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btProximo)
                                .addGap(18, 18, 18)
                                .addComponent(btUltimo)
                                .addGap(82, 82, 82)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxDesativado)
                            .addComponent(btCadCliente)
                            .addComponent(btAlterar)
                            .addComponent(btExcluir)
                            .addComponent(btReplicar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lObrigatorioDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lObrigatorioCategoria1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btConfirmar)
                                .addComponent(btVoltar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btSair)
                        .addComponent(btAnterior)
                        .addComponent(btProximo)
                        .addComponent(btPrimeiro)
                        .addComponent(btUltimo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel16))
                                .addGap(27, 27, 27)))
                        .addGap(54, 54, 54)))
                .addGap(34, 34, 34))
        );

        btCadCliente.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxDesativadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDesativadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDesativadoActionPerformed

    private void btCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadClienteActionPerformed
        confirmAcao = 'C';//Receber a letra que representa o tipo da ação cadastrar
//Desabilitar os outros botões de CRUD
        btReplicar.setEnabled(false);
        btAlterar.setEnabled(false);
        btExcluir.setEnabled(false);
//Comportamento dos campos
        txtIdCliente.setText("");
        txtRazaoSocial.setText("");
        txtRazaoSocial.setEditable(true);
        cbUF.setEnabled(true);
        txtEmail.setText("");
        txtEmail.setEditable(true);
        cbxDesativado.setSelected(false);
        cbxDesativado.setEnabled(true);
        txtEndereco.setText("");
        txtEndereco.setEditable(true);
//Botoes de confirmações
        btConfirmar.setVisible(true);
        btVoltar.setVisible(true);
        btSair.setEnabled(false);
        btAnterior.setVisible(false);
        btProximo.setVisible(false);
        btPrimeiro.setVisible(false);
        btUltimo.setVisible(false);
        
    }//GEN-LAST:event_btCadClienteActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        if(indice < clientesCad.size() - 1){
            indice++;
            clientesCad = selectClientes.buscarCliente(); // Atualiza a lista de clientes, se necessário

            txtIdCliente.setText(Integer.toString(clientesCad.get(indice).getIdCliente()));
            txtRazaoSocial.setText(clientesCad.get(indice).getRazaoSocial());
            txtApelido.setText(clientesCad.get(indice).getApelido());
            txtCpfCnpj.setText(clientesCad.get(indice).getCpfCnpj());
            txtTelefone.setText(clientesCad.get(indice).getTelefone());
            txtEmail.setText(clientesCad.get(indice).getEmail());
            txtCep.setText(clientesCad.get(indice).getCep());
            txtEndereco.setText(clientesCad.get(indice).getEndereco());
            txtBairro.setText(clientesCad.get(indice).getBairro());
            txtNumero.setText(clientesCad.get(indice).getNumero());
            txtCidade.setText(clientesCad.get(indice).getCidade());
            cbUF.setSelectedItem(clientesCad.get(indice).getUf());
            cbPais.setSelectedItem(clientesCad.get(indice).getPais());
            cbxDesativado.setSelected(clientesCad.get(indice).getDesativado());
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void cbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUFActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
         int resposta = JOptionPane.showConfirmDialog(
            null,
            "Tem certeza que deseja sair?",
            "Confirmar Saída",
            JOptionPane.YES_NO_OPTION);

    if (resposta == JOptionPane.YES_OPTION) {
        dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Saída cancelada."); 
    }
    }//GEN-LAST:event_btSairActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
    if(indice > 0){
        indice--;
        clientesCad = selectClientes.buscarCliente(); // Atualiza a lista de clientes, se necessário
        
        txtIdCliente.setText(Integer.toString(clientesCad.get(indice).getIdCliente()));
        txtRazaoSocial.setText(clientesCad.get(indice).getRazaoSocial());
        txtApelido.setText(clientesCad.get(indice).getApelido());
        txtCpfCnpj.setText(clientesCad.get(indice).getCpfCnpj());
        txtTelefone.setText(clientesCad.get(indice).getTelefone());
        txtEmail.setText(clientesCad.get(indice).getEmail());
        txtCep.setText(clientesCad.get(indice).getCep());
        txtEndereco.setText(clientesCad.get(indice).getEndereco());
        txtBairro.setText(clientesCad.get(indice).getBairro());
        txtNumero.setText(clientesCad.get(indice).getNumero());
        txtCidade.setText(clientesCad.get(indice).getCidade());
        cbUF.setSelectedItem(clientesCad.get(indice).getUf());
        cbPais.setSelectedItem(clientesCad.get(indice).getPais());
        cbxDesativado.setSelected(clientesCad.get(indice).getDesativado());
    }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        confirmAcao = 'A';//Receber a letra que representa o tipo da ação alterar
//Desabilitar os outros botões de CRUD
        btCadCliente.setEnabled(false);
        btReplicar.setEnabled(false);
        btExcluir.setEnabled(false);
//Comportamento dos campos
        txtRazaoSocial.setEditable(true);
        cbUF.setEnabled(true);
        txtEmail.setEditable(true);
        cbxDesativado.setEnabled(true);
        txtEndereco.setEditable(true);
//Botoes de confirmações
        btConfirmar.setVisible(true);
        btVoltar.setVisible(true);
        btSair.setEnabled(false);
        btAnterior.setVisible(false);
        btProximo.setVisible(false);
        btPrimeiro.setVisible(false);
        btUltimo.setVisible(false);
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        confirmAcao = 'E';//Receber a letra que representa o tipo da ação excluir
//Desabilitar os outros botões de CRUD
        btCadCliente.setEnabled(false);
        btReplicar.setEnabled(false);
        btAlterar.setEnabled(false);
//Comportamento dos campos
        txtRazaoSocial.setEditable(false);
        cbUF.setEnabled(false);
        txtEmail.setEditable(false);
        cbxDesativado.setEnabled(false);
        txtEndereco.setEditable(false);     
//Botoes de confirmações
        btConfirmar.setVisible(true);
        btVoltar.setVisible(true);
        btSair.setEnabled(false);
        btAnterior.setVisible(false);
        btProximo.setVisible(false);
        btPrimeiro.setVisible(false);
        btUltimo.setVisible(false);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        if(confirmAcao == 'C'){
            ClienteDAO dao = new ClienteDAO();
            MCadCliente cliente = new MCadCliente();

            cliente.setRazaoSocial(txtRazaoSocial.getText());
            cliente.setApelido(txtApelido.getText());
            cliente.setCpfCnpj(txtCpfCnpj.getText());
            cliente.setTelefone(txtTelefone.getText());
            cliente.setEmail(txtEmail.getText());
            cliente.setCep(txtCep.getText());
            cliente.setEndereco(txtEndereco.getText());
            cliente.setBairro(txtBairro.getText());
            cliente.setNumero(txtNumero.getText());
            cliente.setCidade(txtCidade.getText());
            String ufSelecionada = cbUF.getSelectedItem().toString();
            cliente.setUf(ufSelecionada);
            String paisSelecionado = cbPais.getSelectedItem().toString();
            cliente.setPais(paisSelecionado);
            cliente.setDesativado(cbxDesativado.isSelected());


            // Validação dos dados para cadastro
            if(txtRazaoSocial.getText().trim().length() < 2){
                JOptionPane.showMessageDialog(null, "Campo Razão Social com informação insuficiente para cadastro");
            } else if(txtCpfCnpj.getText().trim().length() < 1){
                JOptionPane.showMessageDialog(null, "CPF/CNPJ não informado");
            } else {
                dao.cadastrarCliente(cliente);
                valCRUD = true;
                indice = clientesCad.size() - 1;
            }
        }

        if(confirmAcao == 'R'){  // Replicar cliente (mesmo que cadastrar, mas pode ter lógica diferente)
            ClienteDAO dao = new ClienteDAO();
            MCadCliente cliente = new MCadCliente();

            cliente.setRazaoSocial(txtRazaoSocial.getText());
            cliente.setApelido(txtApelido.getText());
            cliente.setCpfCnpj(txtCpfCnpj.getText());
            cliente.setTelefone(txtTelefone.getText());
            cliente.setEmail(txtEmail.getText());
            cliente.setCep(txtCep.getText());
            cliente.setEndereco(txtEndereco.getText());
            cliente.setBairro(txtBairro.getText());
            cliente.setNumero(txtNumero.getText());
            cliente.setCidade(txtCidade.getText());
            String ufSelecionada = cbUF.getSelectedItem().toString();
            cliente.setUf(ufSelecionada);
            String paisSelecionado = cbPais.getSelectedItem().toString();
            cliente.setPais(paisSelecionado);
            cliente.setDesativado(cbxDesativado.isSelected());

            // Validação dos dados para replicação
            if(txtRazaoSocial.getText().trim().length() < 2){
                JOptionPane.showMessageDialog(null, "Campo Razão Social com informação insuficiente para replicação");
            } else if(txtCpfCnpj.getText().trim().length() < 1){
                JOptionPane.showMessageDialog(null, "CPF/CNPJ não informado");
            } else {
                dao.cadastrarCliente(cliente);
                valCRUD = true;
                indice = clientesCad.size() - 1;
            }
        }

        if(confirmAcao == 'A'){  // Alterar cliente
            ClienteDAO dao = new ClienteDAO();
            MCadCliente cliente = new MCadCliente();

            int idCliente = Integer.parseInt(txtIdCliente.getText());
            cliente.setIdCliente(idCliente);
            cliente.setRazaoSocial(txtRazaoSocial.getText());
            cliente.setApelido(txtApelido.getText());
            cliente.setCpfCnpj(txtCpfCnpj.getText());
            cliente.setTelefone(txtTelefone.getText());
            cliente.setEmail(txtEmail.getText());
            cliente.setCep(txtCep.getText());
            cliente.setEndereco(txtEndereco.getText());
            cliente.setBairro(txtBairro.getText());
            cliente.setNumero(txtNumero.getText());
            cliente.setCidade(txtCidade.getText());
            String ufSelecionada = cbUF.getSelectedItem().toString();
            cliente.setUf(ufSelecionada);
            String paisSelecionado = cbPais.getSelectedItem().toString();
            cliente.setPais(paisSelecionado);
            cliente.setDesativado(cbxDesativado.isSelected());

            // Validação dos dados para alteração
            if(txtRazaoSocial.getText().trim().length() < 2){
                JOptionPane.showMessageDialog(null, "Campo Razão Social com informação insuficiente para alteração");
            } else if(txtCpfCnpj.getText().trim().length() < 1){
                JOptionPane.showMessageDialog(null, "CPF/CNPJ não informado");
            } else {
                try {
                    dao.alterarCliente(cliente);
                } catch (Exception ex) {
                    Logger.getLogger(JCadCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                valCRUD = true;
            }
        }

        if(confirmAcao == 'E'){  // Excluir cliente
            ClienteDAO dao = new ClienteDAO();
            MCadCliente cliente = new MCadCliente();
            cliente.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
            dao.excluirCliente(cliente.getIdCliente());
            valCRUD = true;
            if(indice < clientesCad.size() - 1){
                indice++;
            } else {
                indice--;
            }
        }

        System.out.println(valCRUD);

        if(valCRUD == true){
            txtIdCliente.setText(Integer.toString(clientesCad.get(indice).getIdCliente()));
            txtRazaoSocial.setText(clientesCad.get(indice).getRazaoSocial());
            txtApelido.setText(clientesCad.get(indice).getApelido());
            txtCpfCnpj.setText(clientesCad.get(indice).getCpfCnpj());
            txtTelefone.setText(clientesCad.get(indice).getTelefone());
            txtEmail.setText(clientesCad.get(indice).getEmail());
            txtCep.setText(clientesCad.get(indice).getCep());
            txtEndereco.setText(clientesCad.get(indice).getEndereco());
            txtBairro.setText(clientesCad.get(indice).getBairro());
            txtNumero.setText(clientesCad.get(indice).getNumero());
            txtCidade.setText(clientesCad.get(indice).getCidade());
            cbPais.setSelectedItem(clientesCad.get(indice).getPais());
            cbPais.setSelectedItem(clientesCad.get(indice).getPais());
            cbUF.setSelectedItem(clientesCad.get(indice).getUf());
            valCRUD = false; // volta a ser false para novas validações
        }

    }//GEN-LAST:event_btConfirmarActionPerformed
                                          
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
                                         
    valCRUD = false; // Confirmação volta a ser false para novos testes
    confirmAcao = 'n';

    // Habilitar os botões de CRUD
    btCadCliente.setEnabled(true);
    btReplicar.setEnabled(true);
    btAlterar.setEnabled(true);
    btExcluir.setEnabled(true);

    // Comportamento dos campos (voltam a ficar desabilitados e preenchidos para navegação)
    txtIdCliente.setEditable(false);
    txtIdCliente.setText(Integer.toString(clientesCad.get(indice).getIdCliente()));

    txtRazaoSocial.setEditable(false);
    txtRazaoSocial.setText(clientesCad.get(indice).getRazaoSocial());

    txtApelido.setEditable(false);
    txtApelido.setText(clientesCad.get(indice).getApelido());

    txtCpfCnpj.setEditable(false);
    txtCpfCnpj.setText(clientesCad.get(indice).getCpfCnpj());

    txtTelefone.setEditable(false);
    txtTelefone.setText(clientesCad.get(indice).getTelefone());

    txtEmail.setEditable(false);
    txtEmail.setText(clientesCad.get(indice).getEmail());

    txtCep.setEditable(false);
    txtCep.setText(clientesCad.get(indice).getCep());

    txtEndereco.setEditable(false);
    txtEndereco.setText(clientesCad.get(indice).getEndereco());

    txtBairro.setEditable(false);
    txtBairro.setText(clientesCad.get(indice).getBairro());

    txtNumero.setEditable(false);
    txtNumero.setText(clientesCad.get(indice).getNumero());

    txtCidade.setEditable(false);
    txtCidade.setText(clientesCad.get(indice).getCidade());

    cbUF.setEnabled(false);
    cbUF.setSelectedItem(clientesCad.get(indice).getUf());

    cbPais.setEnabled(false);
    cbPais.setSelectedItem(clientesCad.get(indice).getPais());

    // Se houver checkbox para status do cliente, ajustar aqui
    // Exemplo: cbxDesativado.setEnabled(false);
    // cbxDesativado.setSelected(!clientesCad.get(indice).isAtivo());

    // Botões de confirmação
    btConfirmar.setVisible(false);
    btVoltar.setVisible(false);

    // Botões de navegação e saída
    btSair.setEnabled(true);
    btAnterior.setVisible(true);
    btProximo.setVisible(true);
    btPrimeiro.setVisible(true);
    btUltimo.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btReplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReplicarActionPerformed
        confirmAcao = 'R';//Receber a letra que representa o tipo da ação replicar
//Desabilitar os outros botões de CRUD
        btCadCliente.setEnabled(false);
        btAlterar.setEnabled(false);
        btExcluir.setEnabled(false);
//Comportamento dos campos
        txtRazaoSocial.setEditable(true);
        cbUF.setEnabled(true);
        txtEmail.setEditable(true);
        cbxDesativado.setEnabled(true);
        txtEndereco.setEditable(true);
//Botoes de confirmações
        btConfirmar.setVisible(true);
        btVoltar.setVisible(true);
        btSair.setEnabled(false);
        btAnterior.setVisible(false);
        btProximo.setVisible(false);
        btPrimeiro.setVisible(false);
        btUltimo.setVisible(false);
    }//GEN-LAST:event_btReplicarActionPerformed

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        indice = 0; // posição inicial
        clientesCad = selectClientes.buscarCliente(); // Atualiza a lista de clientes, se necessário

        txtIdCliente.setText(Integer.toString(clientesCad.get(indice).getIdCliente()));
        txtRazaoSocial.setText(clientesCad.get(indice).getRazaoSocial());
        txtApelido.setText(clientesCad.get(indice).getApelido());
        txtCpfCnpj.setText(clientesCad.get(indice).getCpfCnpj());
        txtTelefone.setText(clientesCad.get(indice).getTelefone());
        txtEmail.setText(clientesCad.get(indice).getEmail());
        txtCep.setText(clientesCad.get(indice).getCep());
        txtEndereco.setText(clientesCad.get(indice).getEndereco());
        txtBairro.setText(clientesCad.get(indice).getBairro());
        txtNumero.setText(clientesCad.get(indice).getNumero());
        txtCidade.setText(clientesCad.get(indice).getCidade());
        cbUF.setSelectedItem(clientesCad.get(indice).getUf());
        cbPais.setSelectedItem(clientesCad.get(indice).getPais());
        cbxDesativado.setSelected(clientesCad.get(indice).getDesativado());
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        clientesCad = selectClientes.buscarCliente(); // Atualiza a lista de clientes, se necessário
        indice = clientesCad.size() - 1; // posição do último elemento

        txtIdCliente.setText(Integer.toString(clientesCad.get(indice).getIdCliente()));
        txtRazaoSocial.setText(clientesCad.get(indice).getRazaoSocial());
        txtApelido.setText(clientesCad.get(indice).getApelido());
        txtCpfCnpj.setText(clientesCad.get(indice).getCpfCnpj());
        txtTelefone.setText(clientesCad.get(indice).getTelefone());
        txtEmail.setText(clientesCad.get(indice).getEmail());
        txtCep.setText(clientesCad.get(indice).getCep());
        txtEndereco.setText(clientesCad.get(indice).getEndereco());
        txtBairro.setText(clientesCad.get(indice).getBairro());
        txtNumero.setText(clientesCad.get(indice).getNumero());
        txtCidade.setText(clientesCad.get(indice).getCidade());
        cbUF.setSelectedItem(clientesCad.get(indice).getUf());
        cbPais.setSelectedItem(clientesCad.get(indice).getPais());
        cbxDesativado.setSelected(clientesCad.get(indice).getDesativado());
    }//GEN-LAST:event_btUltimoActionPerformed

    private void btUltimoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btUltimoKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_PAGE_DOWN){
            btUltimo.doClick();
        }
    }//GEN-LAST:event_btUltimoKeyPressed

    private void btPrimeiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btPrimeiroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_PAGE_UP) {
            btPrimeiro.doClick();
        }
    }//GEN-LAST:event_btPrimeiroKeyPressed

    private void btProximoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btProximoKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_RIGHT){
            btProximo.doClick();
        }
    }//GEN-LAST:event_btProximoKeyPressed

    private void btAnteriorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btAnteriorKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_LEFT){
            btAnterior.doClick();
        }
    }//GEN-LAST:event_btAnteriorKeyPressed

    private void cbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPaisActionPerformed

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
            java.util.logging.Logger.getLogger(JCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cidade;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btCadCliente;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btReplicar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btUltimo;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbPais;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JCheckBox cbxDesativado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lObrigatorioCategoria1;
    private javax.swing.JLabel lObrigatorioDescricao;
    private javax.swing.JTextPane txtApelido;
    private javax.swing.JTextPane txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextPane txtCidade;
    private javax.swing.JFormattedTextField txtCpfCnpj;
    private javax.swing.JTextPane txtEmail;
    private javax.swing.JTextPane txtEndereco;
    private javax.swing.JTextPane txtIdCliente;
    private javax.swing.JTextPane txtNumero;
    private javax.swing.JTextPane txtRazaoSocial;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
