import { ReactComponent as Arrow } from 'assets/img/arrow.svg';
import './style.css';

function Pagination() {
    return (
        <div className="catalog-pagination-container">
      <div className="catalog-pagination-box">
        <button className="catalog-pagination-button" disabled={true}>
          <Arrow />
        </button>
        <p>{`${1} de ${3}`}</p>
        <button className="catalog-pagination-button" disabled={false}>
          <Arrow className="catalog-flip-horizontal" />
        </button>
      </div>
    </div>
  );
}

export default Pagination;