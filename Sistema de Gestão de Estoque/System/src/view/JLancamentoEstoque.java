package view;

import conexao.ClienteDAO;
import conexao.FornecedorDAO;
import conexao.MovimentacaoDAO;
import model.MCadProduto;
import conexao.ProdutoDAO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.MCadCliente;
import model.MCadFornecedor;
import model.Movimentacao;



public class JLancamentoEstoque extends javax.swing.JFrame {
    private int indiceProd = 0;
    private int indiceCli = 0;
    private int indiceForn = 0;
    private Boolean valCRUD = false;
    Boolean botaoAltFornecedor = false;
    private boolean entradaAtiva = false;
    private boolean saidaAtiva = false;
    
    ProdutoDAO selectProdutos = new ProdutoDAO();
    List<MCadProduto> produtosCad = new ArrayList<>();
    
    ClienteDAO selectClientes = new ClienteDAO();
    List<MCadCliente> clientes = new ArrayList<>();
    
    FornecedorDAO selectFonecedor = new FornecedorDAO();
    List<MCadFornecedor> fornecedores = new ArrayList<>();
    
    MovimentacaoDAO movDao = new MovimentacaoDAO();
    Movimentacao movimentacoes = new Movimentacao();

    
    char confirmAcao = 'n';
    
    /**
     * Creates new form Jprincipal2
     */
    public JLancamentoEstoque() {
        initComponents();

        txtCodProduto.setEditable(false);
        txtDescProduto.setEditable(false);
        txtCategoria.setEnabled(false);
        txtRefFab.setEditable(false);
        txtQtdMax.setEditable(false);
        txtQtdMin.setEditable(false);
        txtQtdMovimentada.setEditable(true);//Destravado ao precionar lancar no estoque
        txtQtdAtual.setEditable(false);//Sempre ficar travado
        txtQtdAtual.setBackground(new Color(247, 204, 62));
        txtTotalLancar.setEditable(false);//Sempre ficar travado
        txtTotalLancar.setBackground(new Color(146, 233, 179));
        txtLocalizacao.setEditable(false);

        txtTotalLancar.setEditable(false);//O total a ser movimentado

        btConfirmar.setVisible(false);//Botão confirmar cadastro
        btVoltar.setVisible(false);//Botão sair do cadastro

//Inicializar começando da possicao zero Produtos
        produtosCad = selectProdutos.buscarProdutoLancar();
        txtCodProduto.setText(Integer.toString(produtosCad.get(indiceProd).getCodProduto()));
        txtDescProduto.setText(produtosCad.get(indiceProd).getDescricao());
        txtCategoria.setText(produtosCad.get(indiceProd).getCategoria());
        txtRefFab.setText(produtosCad.get(indiceProd).getRefFab());
        txtQtdMax.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMax()));
        txtQtdMin.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMin()));
        txtQtdAtual.setText(Integer.toString(produtosCad.get(indiceProd).getQtdEstoque()));

//Inicializar começando da possicao zero Clientes
        clientes = selectClientes.buscarClienteMov();
        txtCodCli_Forn.setText(Integer.toString(clientes.get(indiceCli).getIdCliente()));
        txtNomeCli_Forn.setText(clientes.get(indiceCli).getRazaoSocial());
        txtApCli_Forn.setText(clientes.get(indiceCli).getApelido());

//Diferentemente dos clientes e produtos Fornecedores só vao inicializar começando da possicao zero, no botao

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
        jLabel4 = new javax.swing.JLabel();
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
        btProximo = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btLancaEstoque = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCodProduto = new javax.swing.JTextPane();
        btConfirmar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btPrimeiro = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtLocalizacao = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        lObrigatorioCategoria1 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtQtdAtual = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtQtdMovimentada = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtTotalLancar = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        btCalcEntrada = new javax.swing.JButton();
        btCalcSaida = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNomeCli_Forn = new javax.swing.JTextPane();
        lbClienteFornecedor = new javax.swing.JLabel();
        btAltCliForn = new javax.swing.JButton();
        btAnterior1 = new javax.swing.JButton();
        btProximo1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCodCli_Forn = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtApCli_Forn = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtfDataMovim = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNumNFe = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lObrigatorioCategoria2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCategoria = new javax.swing.JTextPane();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(54, 85, 115));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setViewportView(txtDescProduto);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Decrição");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cod. produto");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoria");

        jScrollPane5.setViewportView(txtQtdMin);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Qtd. minima");

        jScrollPane7.setViewportView(txtQtdMax);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qtd. maxima");

        jScrollPane8.setViewportView(txtRefFab);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ref. fabrica");

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout_24x24.png"))); // NOI18N
        btSair.setToolTipText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
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

        btLancaEstoque.setText("Lançar no estoque");
        btLancaEstoque.setToolTipText("Alterar produto");
        btLancaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLancaEstoqueActionPerformed(evt);
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

        lObrigatorioCategoria1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lObrigatorioCategoria1.setForeground(new java.awt.Color(255, 51, 51));
        lObrigatorioCategoria1.setText("*");
        lObrigatorioCategoria1.setToolTipText("Obrigatorio");

        txtQtdAtual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jScrollPane10.setViewportView(txtQtdAtual);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Qtd. atual");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Qtd. a lançar");

        txtQtdMovimentada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jScrollPane11.setViewportView(txtQtdMovimentada);

        txtTotalLancar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jScrollPane12.setViewportView(txtTotalLancar);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Qtd. pós lançamento");

        btCalcEntrada.setText("Entrada");
        btCalcEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcEntradaActionPerformed(evt);
            }
        });

        btCalcSaida.setText("Saída");
        btCalcSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcSaidaActionPerformed(evt);
            }
        });

        txtNomeCli_Forn.setEditable(false);
        jScrollPane2.setViewportView(txtNomeCli_Forn);

        lbClienteFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbClienteFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        lbClienteFornecedor.setText("Cliente");

        btAltCliForn.setText("Fornecedor");
        btAltCliForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltCliFornActionPerformed(evt);
            }
        });

        btAnterior1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow-left2.png"))); // NOI18N
        btAnterior1.setToolTipText("Produto anterior");
        btAnterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnterior1ActionPerformed(evt);
            }
        });
        btAnterior1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btAnterior1KeyPressed(evt);
            }
        });

        btProximo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow-right2.png"))); // NOI18N
        btProximo1.setToolTipText("Proximo produto");
        btProximo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximo1ActionPerformed(evt);
            }
        });
        btProximo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btProximo1KeyPressed(evt);
            }
        });

        txtCodCli_Forn.setEditable(false);
        jScrollPane6.setViewportView(txtCodCli_Forn);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cod. Cliente");

        txtApCli_Forn.setEditable(false);
        jScrollPane13.setViewportView(txtApCli_Forn);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Apelido");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("________________________________________________________________________________________________________________________");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("__________________________________________________________________________________________________________________________________________________________________________");

        try {
            txtfDataMovim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Data movimentação");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Nº NF-e");

        lObrigatorioCategoria2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lObrigatorioCategoria2.setForeground(new java.awt.Color(255, 51, 51));
        lObrigatorioCategoria2.setText("*");
        lObrigatorioCategoria2.setToolTipText("Obrigatorio");

        jScrollPane4.setViewportView(txtCategoria);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btLancaEstoque)
                                .addGap(18, 18, 18)
                                .addComponent(btCalcEntrada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCalcSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfDataMovim, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lObrigatorioCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lObrigatorioCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNumNFe, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(117, 117, 117))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btConfirmar)
                                .addGap(18, 18, 18)
                                .addComponent(btVoltar))
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAnterior1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btProximo1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbClienteFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAltCliForn))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPrimeiro)
                        .addGap(7, 7, 7)
                        .addComponent(btAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btProximo)
                        .addGap(18, 18, 18)
                        .addComponent(btUltimo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane9)))))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btAnterior)
                        .addComponent(btProximo)
                        .addComponent(btUltimo)
                        .addComponent(btPrimeiro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAltCliForn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btAnterior1)
                                    .addComponent(btProximo1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(lObrigatorioCategoria2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtfDataMovim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel19)
                                            .addComponent(lObrigatorioCategoria1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumNFe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLancaEstoque)
                            .addComponent(btCalcEntrada)
                            .addComponent(btCalcSaida)
                            .addComponent(btConfirmar)
                            .addComponent(btVoltar))
                        .addGap(76, 76, 76)
                        .addComponent(btSair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbClienteFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(379, 379, 379)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        if(indiceProd < produtosCad.size() -1){
            indiceProd++;
            produtosCad = selectProdutos.buscarProdutoLancar();
            txtCodProduto.setText(Integer.toString(produtosCad.get(indiceProd).getCodProduto()));
            txtDescProduto.setText(produtosCad.get(indiceProd).getDescricao());
            txtCategoria.setText(produtosCad.get(indiceProd).getCategoria());
            txtRefFab.setText(produtosCad.get(indiceProd).getRefFab());
            txtQtdMax.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMax()));
            txtQtdMin.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMin()));
            txtQtdAtual.setText(Integer.toString(produtosCad.get(indiceProd).getQtdEstoque()));
            txtQtdAtual.setBackground(new Color(247, 204, 62));
        }
    }//GEN-LAST:event_btProximoActionPerformed

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
        if(indiceProd > 0){
            indiceProd--;
            produtosCad = selectProdutos.buscarProdutoLancar();
            txtCodProduto.setText(Integer.toString(produtosCad.get(indiceProd).getCodProduto()));
            txtDescProduto.setText(produtosCad.get(indiceProd).getDescricao());
            txtCategoria.setText(produtosCad.get(indiceProd).getCategoria()); 
            txtRefFab.setText(produtosCad.get(indiceProd).getRefFab());
            txtQtdMax.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMax()));
            txtQtdMin.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMin()));
            txtQtdAtual.setText(Integer.toString(produtosCad.get(indiceProd).getQtdEstoque()));
            txtQtdAtual.setBackground(new Color(247, 204, 62));
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btLancaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLancaEstoqueActionPerformed
        confirmAcao = 'A';//Receber a letra que representa o tipo da ação alterar
//Desabilitar os outros botões de CRUD
//Comportamento dos campos
        txtDescProduto.setEditable(true);
        txtCategoria.setEnabled(true);
        txtRefFab.setEditable(true);
        txtQtdMax.setEditable(true);
        txtQtdMin.setEditable(true);
        txtQtdAtual.setEditable(true);
        txtQtdMovimentada.requestFocusInWindow();//Focar no campo
        txtQtdMovimentada.setEditable(true);
        txtQtdMovimentada.setBackground(new Color(106, 212, 236));
//Botoes de confirmações
        btConfirmar.setVisible(true);
        btVoltar.setVisible(true);
        btSair.setEnabled(false);
        btAnterior.setVisible(false);
        btProximo.setVisible(false);
        btPrimeiro.setVisible(false);
        btUltimo.setVisible(false);
    }//GEN-LAST:event_btLancaEstoqueActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        if(confirmAcao == 'A'){
        try {
            // Definir tipo de movimentação
            if (btCalcEntrada.isEnabled() && !btCalcSaida.isEnabled()) {
                movimentacoes.setTipoMovimentacao((byte) 1); // 1 indica entrada
            } else if (!btCalcEntrada.isEnabled() && btCalcSaida.isEnabled()) {
                movimentacoes.setTipoMovimentacao((byte) 2); // 2 indica saída
            } else {
                // Caso nenhum ou ambos estejam habilitados, lançar exceção ou tratar erro
                throw new IllegalStateException("Selecione apenas Entrada ou Saída.");
            }

            // Tratamento da data da movimentação para envio para o banco de dados
            String dataMov = txtfDataMovim.getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(dataMov, formatter);
            Date date = java.sql.Date.valueOf(localDate);
            movimentacoes.setDataMovimentacao(date);

            // Tratamento do código do produto
            int codProduto = Integer.parseInt(txtCodProduto.getText());
            movimentacoes.setCodProduto(codProduto);
            produtosCad.get(indiceProd).setCodProduto(codProduto);

            // Tratamento da quantidade movimentada e atualização do estoque
            int qtdMovimentada = Integer.parseInt(txtQtdMovimentada.getText());
            int qtdAtual = produtosCad.get(indiceProd).getQtdEstoque();
            int opEstoque = qtdAtual;

            if (movimentacoes.getTipoMovimentacao() == 1) { // Entrada
                opEstoque = qtdAtual + qtdMovimentada;
                movimentacoes.setQtdMovimentada(qtdMovimentada);
            } else if (movimentacoes.getTipoMovimentacao() == 2) { // Saída
                opEstoque = qtdAtual - qtdMovimentada;
                movimentacoes.setQtdMovimentada(qtdMovimentada);
                if (opEstoque < 0) {
                    throw new IllegalArgumentException("Estoque insuficiente para saída.");
                }
            }
            //Corrigir a qtd maxima
            produtosCad.get(indiceProd).setQtdEstoque(opEstoque);

            // Tratamento dos IDs de Cliente e Fornecedor
            Integer idFornecedor = null;
            Integer idCliente = null;
            if (btAltCliForn.getText().equalsIgnoreCase("Fornecedor")) {
                idCliente = Integer.parseInt(txtCodCli_Forn.getText());
                movimentacoes.setIdCliente(idCliente);
                movimentacoes.setIdFornecedor(null);
                
            } else if (btAltCliForn.getText().equalsIgnoreCase("Cliente")) {
                idFornecedor = Integer.parseInt(txtCodCli_Forn.getText());
                movimentacoes.setIdFornecedor(idFornecedor);
                movimentacoes.setIdCliente(null);
            } else {
                movimentacoes.setIdCliente(null);
                movimentacoes.setIdFornecedor(null);
            }

            // Tratamento do número da NFe
            String numNFe = txtNumNFe.getText();
            movimentacoes.setNumNFe(numNFe);

            // Atualizar produto e movimentação no banco de dados
            selectProdutos.lancaEstoque(produtosCad.get(indiceProd));
            movDao.create(movimentacoes);

            valCRUD = true;

        } catch (Exception e) {
            valCRUD = false;
            JOptionPane.showMessageDialog(null, "Erro ao confirmar alteração: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            
        }
    }

    if(valCRUD){
        // Atualizar campos da interface com os dados atualizados
        txtCodProduto.setText(Integer.toString(produtosCad.get(indiceProd).getCodProduto()));
        txtDescProduto.setText(produtosCad.get(indiceProd).getDescricao());
        txtCategoria.setText(produtosCad.get(indiceProd).getCategoria());
        txtRefFab.setText(produtosCad.get(indiceProd).getRefFab());
        txtQtdMax.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMax()));
        txtQtdMin.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMin()));

        valCRUD = false; 
        
        entradaAtiva = false;
        saidaAtiva = false;
        btCalcEntrada.setEnabled(true);
        btCalcSaida.setEnabled(true);
        txtQtdMovimentada.setText("");
        txtTotalLancar.setText("");
    }

    }//GEN-LAST:event_btConfirmarActionPerformed
                                          
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        valCRUD = false;//Confirmacao volta ser false para novos testes
        confirmAcao = 'n';
//Habilitar os botões de CRUD
        btLancaEstoque.setEnabled(true);
//Comportamento dos campos (Voltam a ficar Desabilitados e preenchidos para poder fazer navegação)
        txtCodProduto.setEditable(false);
        txtCodProduto.setText(Integer.toString(produtosCad.get(indiceProd).getCodProduto()));
        txtDescProduto.setEditable(false);
        txtDescProduto.setText(produtosCad.get(indiceProd).getDescricao());
        txtCategoria.setEnabled(false);
        txtCategoria.setText(produtosCad.get(indiceProd).getCategoria());
        txtRefFab.setEditable(false);
        txtRefFab.setText(produtosCad.get(indiceProd).getRefFab());
        txtQtdMax.setEditable(false);
        txtQtdMax.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMax()));
        txtQtdMin.setEditable(false);
        txtQtdMin.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMin()));
        txtQtdAtual.setBackground(new Color(247, 204, 62));
//Botoes de confirmações
        btConfirmar.setVisible(false);
        btVoltar.setVisible(false);
        btSair.setEnabled(true);
        btAnterior.setVisible(true);
        btProximo.setVisible(true);
        btPrimeiro.setVisible(true);
        btUltimo.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        indiceProd = produtosCad.size()-produtosCad.size();
        produtosCad = selectProdutos.buscarProdutoLancar();
        txtCodProduto.setText(Integer.toString(produtosCad.get(indiceProd).getCodProduto()));
        txtDescProduto.setText(produtosCad.get(indiceProd).getDescricao());
        txtCategoria.setText(produtosCad.get(indiceProd).getCategoria());
        txtRefFab.setText(produtosCad.get(indiceProd).getRefFab());
        txtQtdMax.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMax()));
        txtQtdMin.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMin()));
        txtQtdAtual.setText(Integer.toString(produtosCad.get(indiceProd).getQtdEstoque()));
        txtQtdAtual.setBackground(new Color(247, 204, 62));
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        indiceProd = produtosCad.size()-1;
        produtosCad = selectProdutos.buscarProdutoLancar();
        txtCodProduto.setText(Integer.toString(produtosCad.get(indiceProd).getCodProduto()));
        txtDescProduto.setText(produtosCad.get(indiceProd).getDescricao());
        txtCategoria.setText(produtosCad.get(indiceProd).getCategoria());
        txtRefFab.setText(produtosCad.get(indiceProd).getRefFab());
        txtQtdMax.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMax()));
        txtQtdMin.setText(Integer.toString(produtosCad.get(indiceProd).getQtdMin()));
        txtQtdAtual.setText(Integer.toString(produtosCad.get(indiceProd).getQtdEstoque()));
        txtQtdAtual.setBackground(new Color(247, 204, 62));
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

    private void btCalcEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcEntradaActionPerformed
     if (!entradaAtiva) {
        String textoMovimentada = txtQtdMovimentada.getText();

        if (textoMovimentada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a quantidade a movimentar!");
            return;
        }

        try {
            int qtdAtual = Integer.parseInt(txtQtdAtual.getText());
            int qtdLancar = Integer.parseInt(textoMovimentada);
            int TotalLancar = qtdAtual + qtdLancar;

            txtTotalLancar.setText(String.valueOf(TotalLancar));

            // Desativa a saída enquanto está em entrada
            btCalcSaida.setEnabled(false);

            entradaAtiva = true;
            saidaAtiva = false;

            // Liberar botão de confirmação se quiser
            btConfirmar.setEnabled(true);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números na quantidade movimentada!");
        }
    } else {
        // Se já está ativo (segundo clique), volta ao normal
        entradaAtiva = false;
        btCalcSaida.setEnabled(true);

        // Limpa os campos e bloqueia
        txtQtdMovimentada.setText("");
        txtTotalLancar.setText("");

        btConfirmar.setEnabled(false);
    }
    
    }//GEN-LAST:event_btCalcEntradaActionPerformed

    private void btCalcSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcSaidaActionPerformed
      if (!saidaAtiva) {
        String textoMovimentada = txtQtdMovimentada.getText();

        if (textoMovimentada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a quantidade a movimentar!");
            return;
        }

        try {
            int qtdAtual = Integer.parseInt(txtQtdAtual.getText());
            int qtdLancar = Integer.parseInt(textoMovimentada);
            int TotalLancar = qtdAtual - qtdLancar;

            txtTotalLancar.setText(String.valueOf(TotalLancar));

            btCalcEntrada.setEnabled(false);

            saidaAtiva = true;
            entradaAtiva = false;

            btConfirmar.setEnabled(true);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números na quantidade movimentada!");
        }
    } else {
        // Se já estava em modo saída, reseta
        saidaAtiva = false;
        btCalcEntrada.setEnabled(true);

        txtQtdMovimentada.setText("");
        txtTotalLancar.setText("");

        btConfirmar.setEnabled(false);
    }
    }//GEN-LAST:event_btCalcSaidaActionPerformed

    private void btAnterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnterior1ActionPerformed
        if(botaoAltFornecedor == false){ // Clientes
            if(indiceCli > 0){
                indiceCli--;
                txtCodCli_Forn.setText(Integer.toString(clientes.get(indiceCli).getIdCliente()));
                txtNomeCli_Forn.setText(clientes.get(indiceCli).getRazaoSocial());
                txtApCli_Forn.setText(clientes.get(indiceCli).getApelido());
            }
        } else { // Fornecedores
            if(indiceForn > 0){
                indiceForn--;
                txtCodCli_Forn.setText(Integer.toString(fornecedores.get(indiceForn).getIdFornecedor()));
                txtNomeCli_Forn.setText(fornecedores.get(indiceForn).getRazaoSocial());
                txtApCli_Forn.setText(fornecedores.get(indiceForn).getApelido());
            }
        }
    }//GEN-LAST:event_btAnterior1ActionPerformed

    private void btAnterior1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btAnterior1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAnterior1KeyPressed

    private void btProximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximo1ActionPerformed
        if(botaoAltFornecedor == false){ // Clientes
            if(indiceCli < clientes.size() - 1){
                indiceCli++;
                txtCodCli_Forn.setText(Integer.toString(clientes.get(indiceCli).getIdCliente()));
                txtNomeCli_Forn.setText(clientes.get(indiceCli).getRazaoSocial());
                txtApCli_Forn.setText(clientes.get(indiceCli).getApelido());
            }
        } else { // Fornecedores
            if(indiceForn < fornecedores.size() - 1){
                indiceForn++;
                txtCodCli_Forn.setText(Integer.toString(fornecedores.get(indiceForn).getIdFornecedor()));
                txtNomeCli_Forn.setText(fornecedores.get(indiceForn).getRazaoSocial());
                txtApCli_Forn.setText(fornecedores.get(indiceForn).getApelido());
            }
        }
    }//GEN-LAST:event_btProximo1ActionPerformed

    private void btProximo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btProximo1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btProximo1KeyPressed

    private void btAltCliFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltCliFornActionPerformed
//Inicializar começando da possicao zero Fornecedores
        botaoAltFornecedor = !botaoAltFornecedor;
        if(botaoAltFornecedor == true){
            btAltCliForn.setText("Clientes");//O nome do botão irá ficar diferente para indicar ao usuario caso ele queira voltar a ver clientes
            lbClienteFornecedor.setText("Fornecedor");//Titulo muda
            fornecedores = selectFonecedor.buscarFornecedor();
            txtCodCli_Forn.setText(Integer.toString(fornecedores.get(indiceForn).getIdFornecedor()));
            txtNomeCli_Forn.setText(fornecedores.get(indiceForn).getRazaoSocial());
            txtApCli_Forn.setText(fornecedores.get(indiceForn).getApelido());
        }
        if(botaoAltFornecedor == false){
            btAltCliForn.setText("Fornecedor");//O nome do botão irá ficar diferente para indicar ao usuario caso ele queira voltar a ver clientes
            lbClienteFornecedor.setText("Clientes");//Titulo muda
            clientes = selectClientes.buscarClienteMov();
            txtCodCli_Forn.setText(Integer.toString(clientes.get(indiceCli).getIdCliente()));
            txtNomeCli_Forn.setText(clientes.get(indiceCli).getRazaoSocial());
            txtApCli_Forn.setText(clientes.get(indiceCli).getApelido());
        }
    }//GEN-LAST:event_btAltCliFornActionPerformed

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
            java.util.logging.Logger.getLogger(JLancamentoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLancamentoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLancamentoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLancamentoEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new JLancamentoEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltCliForn;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btAnterior1;
    private javax.swing.JButton btCalcEntrada;
    private javax.swing.JButton btCalcSaida;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btLancaEstoque;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btProximo1;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btUltimo;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lObrigatorioCategoria1;
    private javax.swing.JLabel lObrigatorioCategoria2;
    private javax.swing.JLabel lbClienteFornecedor;
    private javax.swing.JTextPane txtApCli_Forn;
    private javax.swing.JTextPane txtCategoria;
    private javax.swing.JTextPane txtCodCli_Forn;
    private javax.swing.JTextPane txtCodProduto;
    private javax.swing.JTextPane txtDescProduto;
    private javax.swing.JTextPane txtLocalizacao;
    private javax.swing.JTextPane txtNomeCli_Forn;
    private javax.swing.JTextField txtNumNFe;
    private javax.swing.JTextPane txtQtdAtual;
    private javax.swing.JTextPane txtQtdMax;
    private javax.swing.JTextPane txtQtdMin;
    private javax.swing.JTextPane txtQtdMovimentada;
    private javax.swing.JTextPane txtRefFab;
    private javax.swing.JTextPane txtTotalLancar;
    private javax.swing.JFormattedTextField txtfDataMovim;
    // End of variables declaration//GEN-END:variables
}
