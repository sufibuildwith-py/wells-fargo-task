@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @Column
    private String portfolioName;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    public Portfolio() {}

    public Portfolio(String portfolioName,
                     Client client,
                     List<Security> securities) {
        this.portfolioName = portfolioName;
        this.client = client;
        this.securities = securities;
    }

    // Getters & Setters
}