import "./style.css";
import jogo_banheiro from "assets/img/jogo_banheiro01.jpeg";

function Form(){
    const croche = {
        id: 1,
        name: "Jogo de banheiro",
        description: "Conjunto de banheiro em crochê",
        price: 150.00,
        imgUrl: jogo_banheiro
    }
   return (
        <form className="form-container">
            <h3>{croche.name}</h3>
            <p>Preço: R$ {croche.price.toFixed(2)}</p>
            <img src={croche.imgUrl} alt={croche.name} className="croche-image"/>
            <div className="form-group">
                <label htmlFor="email">Informe seu e-mail</label>
                <input type="email" className="form-control" id="email" />
            </div>

            <div className="form-group">
                <label htmlFor="quantity">Quantidade</label>
                <select className="form-control" id="quantity">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>

            <div className="form-actions">
                <button type="submit" className="btn btn-primary">
                    Comprar
                </button>
                <button type="button" className="btn btn-secondary">
                    Cancelar
                </button>
            </div>
        </form>
    );
}

export default Form;