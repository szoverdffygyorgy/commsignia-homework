import VehicleListItemDto from "../../../../api/dto/vehicle-list-item-dto";
import VehicleListItem from "../vehicle-list-item/vehicle-list-item";

import "./vehicle-list.css";

type VehicleListProps = {
  vehicles: VehicleListItemDto[];
};

const VehicleList = ({ vehicles }: VehicleListProps) => {
  return (
    <div className="vehicle-list">
      <h2 className="header">Vehicles</h2>
      <div className="list-wrapper">
        {vehicles.map((vehicle) => (
          <div className="list-item" key={vehicle.id}>
            <VehicleListItem vehicle={vehicle} />
          </div>
        ))}
      </div>
    </div>
  );
};

export default VehicleList;
