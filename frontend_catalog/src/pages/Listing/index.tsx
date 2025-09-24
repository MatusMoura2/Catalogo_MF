import Pagination from "components/Pagination";
import CrochetCard from "components/CrochetCard";
import jogo_banheiro from "assets/img/jogo_banheiro01.jpeg"; 
import './style.css';

interface CrochetItem {
    id: number;
    name: string;
    description: string;
    weight: string;
    price: number;
    imgUrl: string;
}

function Listing() {
    const crochetPieces: CrochetItem[] = [
    {
        id: 1,
        name: "Jogo de banheiro",
        description: "Conjunto de 3 peças em crochê.",
        weight: "1.2kg",
        price: 150.00,
        imgUrl: jogo_banheiro
    },
    {
        id: 2,
        name: "Tapete de sala",
        description: "Tapete grande, ideal para a sala.",
        weight: "2kg",
        price: 180.00,
        imgUrl: jogo_banheiro
    },
    {
        id: 3,
        name: "Cesto organizador",
        description: "Cesto multiuso para decoração.",
        weight: "0.4kg",
        price: 95.00,
        imgUrl: jogo_banheiro
    },
    {
        id: 4,
        name: "Capa de almofada",
        description: "Capa decorativa para almofada.",
        weight: "0.5kg",
        price: 90.00,
        imgUrl: jogo_banheiro
    },
    {
        id: 5,
        name: "Kit de sousplat",
        description: "Kit com 6 sousplats de crochê para mesa.",
        weight: "1.5kg",
        price: 220.00,
        imgUrl: jogo_banheiro
    },
    {
        id: 6,
        name: "Boneca amigurumi",
        description: "Boneca de crochê em formato de urso.",
        weight: "0.3kg",
        price: 85.00,
        imgUrl: jogo_banheiro
    },
    {
        id: 7,
        name: "Cachecol de lã",
        description: "Cachecol de lã macia para o inverno.",
        weight: "0.2kg",
        price: 75.00,
        imgUrl: jogo_banheiro
    },
    {
        id: 8,
        name: "Porta-copos",
        description: "Conjunto de 4 porta-copos de crochê.",
        weight: "0.1kg",
        price: 45.00,
        imgUrl: jogo_banheiro
    }
];


    return (
        <div className="container listing-container">
            <div className="row">
                {crochetPieces.map(piece => (

                    <div key={piece.id} className="col-sm-6 col-lg-4 col-xl-3 mb-4">
                        <CrochetCard item={piece} />
                    </div>
                ))}
            </div>
            
            <Pagination />
        </div>
    );
}

export default Listing;