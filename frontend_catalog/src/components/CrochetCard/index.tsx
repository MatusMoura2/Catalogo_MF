import './style.css';

interface CrochetItem {
    id: number;
    name: string;
    description: string;
    weight: string;
    price: number;
    imgUrl: string;
}

type Props = {
    item: CrochetItem;
}


function CrochetCard({ item }: Props) {
    return (
        <div className="crochet-card">
            <img src={item.imgUrl} alt={item.name} className="crochet-card-img" />
            <div className="crochet-card-body">
                <h3>{item.name}</h3>
                <p className="crochet-description">{item.description}</p>
                <p className="crochet-weight">Peso: {item.weight}</p>
                <button className="btn btn-primary crochet-card-btn">
                    Comprar por R$ {item.price.toFixed(2)}
                </button>
            </div>
        </div>
    );
}

export default CrochetCard;