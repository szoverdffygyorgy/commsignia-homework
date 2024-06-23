import { useNavigate } from "react-router-dom";
import { Route } from "../../../../routes/routes";
import VehicleListItemDto from "../../../../api/dto/vehicle-list-item-dto";

import "./vehicle-list-item.css";
import VehicleLocationLink from "../../../../components/vehicle-location-link/vehicle-location-link";
import VehicleLocation from "../../../../components/vehicle-location/vehicle-location";

type VehicleListItemProps = {
  vehicle: VehicleListItemDto;
};

const VehicleListItem = ({ vehicle }: VehicleListItemProps) => {
  const navigate = useNavigate();

  const onItemClick = () =>
    navigate(Route.VEHICLES.BY_ID.replace(":id", vehicle.id));

  return (
    <div className="vehicle-list-item" onClick={onItemClick}>
      <h3 className="header">Vehicle #{vehicle.id}</h3>
      <div className="info">
        <h4>Location</h4>
        <div className="location-wrapper">
          <VehicleLocation vehicle={vehicle} />
          <VehicleLocationLink vehicle={vehicle} />
        </div>
      </div>
      <div className="notifications">
        <h4>{vehicle.numOfNotifications} Notifications</h4>
      </div>
    </div>
  );
};

export default VehicleListItem;
