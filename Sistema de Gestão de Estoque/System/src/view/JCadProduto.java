package view;

import model.MCadProduto;
import conexao.ProdutoDAO;
import java.awt.event.KeyEvent;
import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class JCadProduto extends javax.swing.JFrame {
    private int indice = 0;
    private Boolean valCRUD = false;//variavel para verificar se o crud foi realizado
    ProdutoDAO selectProdutos = new ProdutoDAO();
    List<MCadProduto> produtosCad = new ArrayList<>();
    char confirmAcao = 'n';
    
    /**
     * Creates new form Jprincipal2
     */
    public JCadProduto() {
        initComponents();
//Laout de abertura, campos travados
        txtCodProduto.setEditable(false);
        txtDescProduto.setEditable(false);
        cbCategoria.setEnabled(false);
        cbUnidade.setEnabled(false);
        txtRefFab.setEditable(false);
        txtQtdMax.setEditable(false);
        txtQtdMin.setEditable(false);
        txtLocalizacao.setEditable(false);
        cbxDesativado.setEnabled(false);
        txtObs.setEditable(false);

        btConfirmar.setVisible(false);//Botão confirmar cadastro
        btVoltar.setVisible(false);//Botão sair do cadastro
//Inicializar começando da possicao zero    
        produtosCad = selectProdutos.buscarProduto();
        txtCodProduto.setText(Integer.toString(produtosCad.get(indice).getCodProduto()));
        txtDescProduto.setText(produtosCad.get(indice).getDescricao());
        cbCategoria.setSelectedItem(produtosCad.get(indice).getCategoria());
        cbUnidade.setSelectedItem(produtosCad.get(indice).getUnidade()); 
        txtRefFab.setText(produtosCad.get(indice).getRefFab());
        txtQtdMax.setText(Integer.toString(produtosCad.get(indice).getQtdMax()));
        txtQtdMin.setText(Integer.toString(produtosCad.get(indice).getQtdMin()));
        cbxDesativado.setSelected(produtosCad.get(indice).getDesativado());
        txtObs.setText(produtosCad.get(indice).getObservacoes());
        
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescProduto = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbxDesativado = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtQtdMin = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtQtdMax = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtRefFab = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        btCadProduto = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        cbUnidade = new javax.swing.JComboBox<>();
        btAnterior = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCodProduto = new javax.swing.JTextPane();
        btConfirmar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btReplicar = new javax.swing.JButton();
        btPrimeiro = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtLocalizacao = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        lAjudaLocalizacao = new javax.swing.JLabel();
        lObrigatorioDescricao = new javax.swing.JLabel();
        lObrigatorioCategoria = new javax.swing.JLabel();
        lObrigatorioCategoria1 = new javax.swing.JLabel();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(54, 85, 115));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(txtDescProduto);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Decrição");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");

        jScrollPane4.setViewportView(txtObs);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Observação");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoria");

        cbCategoria.setEditable(true);
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alumínio", "Ferragens", "Vidros" }));
        cbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Unidade");

        cbxDesativado.setForeground(new java.awt.Color(255, 255, 255));
        cbxDesativado.setText("Desativar");
        cbxDesativado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDesativadoActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(txtQtdMin);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Qtd. minima");

        jScrollPane7.setViewportView(txtQtdMax);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qtd. maxima");

        jScrollPane8.setViewportView(txtRefFab);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ref. fabrica");

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout_24x24.png"))); // NOI18N
        btSair.setToolTipText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/new.png"))); // NOI18N
        btCadProduto.setToolTipText("Cadastrar novo produto");
        btCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadProdutoActionPerformed(evt);
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

        cbUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UN", "PC", "M²" }));
        cbUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUnidadeActionPerformed(evt);
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

        jScrollPane3.setViewportView(txtCodProduto);

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

        jScrollPane9.setViewportView(txtLocalizacao);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Localização");

        lAjudaLocalizacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lAjudaLocalizacao.setForeground(new java.awt.Color(255, 255, 255));
        lAjudaLocalizacao.setText("?");
        lAjudaLocalizacao.setToolTipText("A - Área\nC - Corredor\nM - Módulo (ex: prateleira ou estante) \nN - Nivel (altura da prateleira) \nV - Vão (espaço específico para o produto)");

        lObrigatorioDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lObrigatorioDescricao.setForeground(new java.awt.Color(255, 51, 51));
        lObrigatorioDescricao.setText("*");
        lObrigatorioDescricao.setToolTipText("Obrigatorio");

        lObrigatorioCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lObrigatorioCategoria.setForeground(new java.awt.Color(255, 51, 51));
        lObrigatorioCategoria.setText("*");
        lObrigatorioCategoria.setToolTipText("Obrigatorio");

        lObrigatorioCategoria1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lObrigatorioCategoria1.setForeground(new java.awt.Color(255, 51, 51));
        lObrigatorioCategoria1.setText("*");
        lObrigatorioCategoria1.setToolTipText("Obrigatorio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lObrigatorioDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lAjudaLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(cbxDesativado)))
                                .addGap(135, 135, 135)
                                .addComponent(btCadProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btReplicar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluir)))
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lObrigatorioCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lObrigatorioCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btPrimeiro)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(184, 184, 184)
                                                .addComponent(btConfirmar))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btAnterior)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btProximo)
                                                .addGap(18, 18, 18)
                                                .addComponent(btUltimo)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btVoltar)
                                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane4)
                                        .addGap(236, 236, 236)))
                                .addGap(26, 26, 26)))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxDesativado)
                    .addComponent(btCadProduto)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(btReplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lObrigatorioDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lObrigatorioCategoria1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(lObrigatorioCategoria))
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lAjudaLocalizacao))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btConfirmar)
                        .addComponent(btVoltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSair)
                    .addComponent(btAnterior)
                    .addComponent(btProximo)
                    .addComponent(btPrimeiro)
                    .addComponent(btUltimo))
                .addGap(34, 34, 34))
        );

        btCadProduto.getAccessibleContext().setAccessibleDescription("");

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

    private void cbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaActionPerformed

    private void cbxDesativadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDesativadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDesativadoActionPerformed

    private void btCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadProdutoActionPerformed
        confirmAcao = 'C';//Receber a letra que representa o tipo da ação cadastrar
//Desabilitar os outros botões de CRUD
        btReplicar.setEnabled(false);
        btAlterar.setEnabled(false);
        btExcluir.setEnabled(false);
//Comportamento dos campos
        txtCodProduto.setText("");
        txtDescProduto.setText("");
        txtDescProduto.setEditable(true);
        cbCategoria.setSelectedItem("Selecione");
        cbCategoria.setEnabled(true);
        cbUnidade.setSelectedItem("Selecione"); 
        cbUnidade.setEnabled(true);
        txtRefFab.setText("");
        txtRefFab.setEditable(true);
        txtQtdMax.setText("");
        txtQtdMax.setEditable(true);
        txtQtdMin.setText("");
        txtQtdMin.setEditable(true);
        txtLocalizacao.setEditable(true);
        cbxDesativado.setSelected(false);
        cbxDesativado.setEnabled(true);
        txtObs.setText("");
        txtObs.setEditable(true);
//Botoes de confirmações
        btConfirmar.setVisible(true);
        btVoltar.setVisible(true);
        btSair.setEnabled(false);
        btAnterior.setVisible(false);
        btProximo.setVisible(false);
        btPrimeiro.setVisible(false);
        btUltimo.setVisible(false);
        
    }//GEN-LAST:event_btCadProdutoActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        if(indice < produtosCad.size() -1){
            indice++;
            produtosCad = selectProdutos.buscarProduto();
            txtCodProduto.setText(Integer.toString(produtosCad.get(indice).getCodProduto()));
            txtDescProduto.setText(produtosCad.get(indice).getDescricao());
            cbCategoria.setSelectedItem(produtosCad.get(indice).getCategoria());
            cbUnidade.setSelectedItem(produtosCad.get(indice).getUnidade()); 
            txtRefFab.setText(produtosCad.get(indice).getRefFab());
            txtQtdMax.setText(Integer.toString(produtosCad.get(indice).getQtdMax()));
            txtQtdMin.setText(Integer.toString(produtosCad.get(indice).getQtdMin()));
            cbxDesativado.setSelected(produtosCad.get(indice).getDesativado());
            txtObs.setText(produtosCad.get(indice).getObservacoes());
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void cbUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUnidadeActionPerformed

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
            produtosCad = selectProdutos.buscarProduto();
            txtCodProduto.setText(Integer.toString(produtosCad.get(indice).getCodProduto()));
            txtDescProduto.setText(produtosCad.get(indice).getDescricao());
            cbCategoria.setSelectedItem(produtosCad.get(indice).getCategoria());
            cbUnidade.setSelectedItem(produtosCad.get(indice).getUnidade()); 
            txtRefFab.setText(produtosCad.get(indice).getRefFab());
            txtQtdMax.setText(Integer.toString(produtosCad.get(indice).getQtdMax()));
            txtQtdMin.setText(Integer.toString(produtosCad.get(indice).getQtdMin()));
            cbxDesativado.setSelected(produtosCad.get(indice).getDesativado());
            txtObs.setText(produtosCad.get(indice).getObservacoes());
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        confirmAcao = 'A';//Receber a letra que representa o tipo da ação alterar
//Desabilitar os outros botões de CRUD
        btCadProduto.setEnabled(false);
        btReplicar.setEnabled(false);
        btExcluir.setEnabled(false);
//Comportamento dos campos
        txtDescProduto.setEditable(true);
        cbCategoria.setEnabled(true);
        cbUnidade.setEnabled(true);
        txtRefFab.setEditable(true);
        txtQtdMax.setEditable(true);
        txtQtdMin.setEditable(true);
        cbxDesativado.setEnabled(true);
        txtObs.setEditable(true);
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
        btCadProduto.setEnabled(false);
        btReplicar.setEnabled(false);
        btAlterar.setEnabled(false);
//Comportamento dos campos
        txtDescProduto.setEditable(false);
        cbCategoria.setEnabled(false);
        cbUnidade.setEnabled(false);
        txtRefFab.setEditable(false);
        txtQtdMax.setEditable(false);
        txtQtdMin.setEditable(false);
        txtLocalizacao.setEditable(false);
        cbxDesativado.setEnabled(false);
        txtObs.setEditable(false);     
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
            ProdutoDAO dao = new ProdutoDAO();
            MCadProduto cadPro = new MCadProduto();
            cadPro.setDescricao(txtDescProduto.getText().toUpperCase());
            cadPro.setCategoria((String) cbCategoria.getSelectedItem());
            cadPro.setUnidade((String) cbUnidade.getSelectedItem());
            cadPro.setRefFab(txtRefFab.getText());
            cadPro.setQtdMax(txtQtdMax.getText());
            cadPro.setQtdMin(txtQtdMin.getText());
            cadPro.setObservacoes(txtObs.getText().toUpperCase());
            cadPro.setDesativado(cbxDesativado.isSelected());
//Validacao dos dados para cadastro
            if(txtDescProduto.getText().trim().length()<2){
                JOptionPane.showMessageDialog(null, "Campo descrição com informação insuficiente para cadastro");
            }else if(cbCategoria.getSelectedItem().equals("Selecione")){
                JOptionPane.showMessageDialog(null, "Categoria não selecionada");
            }
            else if(txtRefFab.getText().length()<1){
                JOptionPane.showMessageDialog(null, "Produto sem código de referência de fabrica");
            }else{
                dao.create(cadPro);
                valCRUD = true;
                indice = produtosCad.size()-1;
            }
        }
        if(confirmAcao == 'R'){
            ProdutoDAO dao = new ProdutoDAO();
            MCadProduto cadPro = new MCadProduto();
            cadPro.setDescricao(txtDescProduto.getText().toUpperCase());
            cadPro.setCategoria((String) cbCategoria.getSelectedItem());
            cadPro.setUnidade((String) cbUnidade.getSelectedItem());
            cadPro.setRefFab(txtRefFab.getText());
            cadPro.setQtdMax(txtQtdMax.getText());
            cadPro.setQtdMin(txtQtdMin.getText());
            cadPro.setObservacoes(txtObs.getText().toUpperCase());
            cadPro.setDesativado(cbxDesativado.isSelected());
//Validacao dos dados para cadastro
            if(txtDescProduto.getText().trim().length()<2){
                JOptionPane.showMessageDialog(null, "Campo descrição com informação insuficiente para cadastro");
            }else if(cbCategoria.getSelectedItem().equals("Selecione")){
                JOptionPane.showMessageDialog(null, "Categoria não selecionada");
            }
            else if(txtRefFab.getText().length()<1){
                JOptionPane.showMessageDialog(null, "Produto sem código de referência de fabrica");
            }else{
                dao.create(cadPro);
                valCRUD = true;
                indice = produtosCad.size()-1;
            }
        }
        if(confirmAcao == 'A'){
            ProdutoDAO dao = new ProdutoDAO();
            MCadProduto cadPro = new MCadProduto();

            int codigoProduto = Integer.parseInt(txtCodProduto.getText());
            cadPro.setCodProduto(codigoProduto);
            cadPro.setDescricao(txtDescProduto.getText().toUpperCase());
            cadPro.setCategoria((String) cbCategoria.getSelectedItem());
            cadPro.setRefFab(txtRefFab.getText());
            cadPro.setQtdMax(txtQtdMax.getText());
            cadPro.setQtdMin(txtQtdMin.getText());
            cadPro.setObservacoes(txtObs.getText().toUpperCase());
            cadPro.setDesativado(cbxDesativado.isSelected());
//Validacao dos dados para alteração
            if(txtDescProduto.getText().trim().length()<2){
                JOptionPane.showMessageDialog(null, "Campo descrição com informação insuficiente para alteração");
            }else if(cbCategoria.getSelectedItem().equals("Selecione")){
                JOptionPane.showMessageDialog(null, "Categoria não selecionada");
            }
            else if(txtRefFab.getText().length()<1){
                JOptionPane.showMessageDialog(null, "Produto sem código de referência de fabrica");
            }else{
                try {
                    dao.atualizar(cadPro);
                } catch (SQLException ex) {
                    Logger.getLogger(JCadProduto.class.getName()).log(Level.SEVERE, null, ex);
                }
                valCRUD = true;
            }
        }
        if(confirmAcao == 'E'){
            ProdutoDAO dao = new ProdutoDAO();
            MCadProduto cadPro = new MCadProduto();
            cadPro.setCodProduto(Integer.parseInt(txtCodProduto.getText()));
            dao.deletar(cadPro);
            valCRUD = true;
            if(indice < produtosCad.size() -1){
                indice++;
            }else{
                indice--;
                }
        }
        System.out.println(valCRUD);
        if(valCRUD == true){
            txtCodProduto.setText(Integer.toString(produtosCad.get(indice).getCodProduto()));
            txtDescProduto.setText(produtosCad.get(indice).getDescricao());
            cbCategoria.setSelectedItem(produtosCad.get(indice).getCategoria());
            cbUnidade.setSelectedItem(produtosCad.get(indice).getUnidade()); 
            txtRefFab.setText(produtosCad.get(indice).getRefFab());
            txtQtdMax.setText(Integer.toString(produtosCad.get(indice).getQtdMax()));
            txtQtdMin.setText(Integer.toString(produtosCad.get(indice).getQtdMin()));
            cbxDesativado.setSelected(produtosCad.get(indice).getDesativado());
            txtObs.setText(produtosCad.get(indice).getObservacoes());
            valCRUD = false;//volta a ser false para novas validações
        }
    }//GEN-LAST:event_btConfirmarActionPerformed
                                          
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        valCRUD = false;//Confirmacao volta ser false para novos testes
        confirmAcao = 'n';
//Habilitar os botões de CRUD
        btCadProduto.setEnabled(true);
        btReplicar.setEnabled(true);
        btAlterar.setEnabled(true);
        btExcluir.setEnabled(true);
//Comportamento dos campos (Voltam a ficar Desabilitados e preenchidos para poder fazer navegação)
        txtCodProduto.setEditable(false);
        txtCodProduto.setText(Integer.toString(produtosCad.get(indice).getCodProduto()));
        txtDescProduto.setEditable(false);
        txtDescProduto.setText(produtosCad.get(indice).getDescricao());
        cbCategoria.setEnabled(false);
        cbCategoria.setSelectedItem(produtosCad.get(indice).getCategoria());
        cbUnidade.setEnabled(false);
        cbUnidade.setSelectedItem(produtosCad.get(indice).getUnidade());
        txtRefFab.setEditable(false);
        txtRefFab.setText(produtosCad.get(indice).getRefFab());
        txtQtdMax.setEditable(false);
        txtQtdMax.setText(Integer.toString(produtosCad.get(indice).getQtdMax()));
        txtQtdMin.setEditable(false);
        txtQtdMin.setText(Integer.toString(produtosCad.get(indice).getQtdMin()));
        cbxDesativado.setEnabled(false);
        cbxDesativado.setSelected(produtosCad.get(indice).getDesativado());
        txtObs.setEditable(false);
        txtObs.setText(produtosCad.get(indice).getObservacoes());
//Botoes de confirmações
        btConfirmar.setVisible(false);
        btVoltar.setVisible(false);
        btSair.setEnabled(true);
        btAnterior.setVisible(true);
        btProximo.setVisible(true);
        btPrimeiro.setVisible(true);
        btUltimo.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btReplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReplicarActionPerformed
        confirmAcao = 'R';//Receber a letra que representa o tipo da ação replicar
//Desabilitar os outros botões de CRUD
        btCadProduto.setEnabled(false);
        btAlterar.setEnabled(false);
        btExcluir.setEnabled(false);
//Comportamento dos campos
        txtDescProduto.setEditable(true);
        cbCategoria.setEnabled(true);
        cbUnidade.setEnabled(true);
        txtRefFab.setEditable(true);
        txtQtdMax.setEditable(true);
        txtQtdMin.setEditable(true);
        cbxDesativado.setEnabled(true);
        txtObs.setEditable(true);
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
        indice = produtosCad.size()-produtosCad.size();
        produtosCad = selectProdutos.buscarProduto();
        txtCodProduto.setText(Integer.toString(produtosCad.get(indice).getCodProduto()));
        txtDescProduto.setText(produtosCad.get(indice).getDescricao());
        cbCategoria.setSelectedItem(produtosCad.get(indice).getCategoria());
        cbUnidade.setSelectedItem(produtosCad.get(indice).getUnidade()); 
        txtRefFab.setText(produtosCad.get(indice).getRefFab());
        txtQtdMax.setText(Integer.toString(produtosCad.get(indice).getQtdMax()));
        txtQtdMin.setText(Integer.toString(produtosCad.get(indice).getQtdMin()));
        cbxDesativado.setSelected(produtosCad.get(indice).getDesativado());
        txtObs.setText(produtosCad.get(indice).getObservacoes());
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
    indice = produtosCad.size()-1;
    produtosCad = selectProdutos.buscarProduto();
    txtCodProduto.setText(Integer.toString(produtosCad.get(indice).getCodProduto()));
    txtDescProduto.setText(produtosCad.get(indice).getDescricao());
    cbCategoria.setSelectedItem(produtosCad.get(indice).getCategoria());
    cbUnidade.setSelectedItem(produtosCad.get(indice).getUnidade()); 
    txtRefFab.setText(produtosCad.get(indice).getRefFab());
    txtQtdMax.setText(Integer.toString(produtosCad.get(indice).getQtdMax()));
    txtQtdMin.setText(Integer.toString(produtosCad.get(indice).getQtdMin()));
    cbxDesativado.setSelected(produtosCad.get(indice).getDesativado());
    txtObs.setText(produtosCad.get(indice).getObservacoes());
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
            java.util.logging.Logger.getLogger(JCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btCadProduto;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btReplicar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btUltimo;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbUnidade;
    private javax.swing.JCheckBox cbxDesativado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lAjudaLocalizacao;
    private javax.swing.JLabel lObrigatorioCategoria;
    private javax.swing.JLabel lObrigatorioCategoria1;
    private javax.swing.JLabel lObrigatorioDescricao;
    private javax.swing.JTextPane txtCodProduto;
    private javax.swing.JTextPane txtDescProduto;
    private javax.swing.JTextPane txtLocalizacao;
    private javax.swing.JTextPane txtObs;
    private javax.swing.JTextPane txtQtdMax;
    private javax.swing.JTextPane txtQtdMin;
    private javax.swing.JTextPane txtRefFab;
    // End of variables declaration//GEN-END:variables
}
