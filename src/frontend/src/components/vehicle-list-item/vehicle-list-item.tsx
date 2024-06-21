import VehicleDto from "../../api/dto/vehicle-dto";
import navigateIcon from "../../assets/navigate.svg";

import "./vehicle-list-item.css";

type VehicleListItemProps = {
  vehicle: VehicleDto;
};

const VehicleListItem = ({ vehicle }: VehicleListItemProps) => {
  const mapsUrl = `https://google.com/maps/search/?api=1&query=${vehicle.latitude},${vehicle.longitude}`;

  return (
    <div className="vehicle-list-item">
      <h3 className="header">Vehicle #{vehicle.id}</h3>
      <div className="info">
        <h4>Location</h4>
        <div className="location-wrapper">
          <div>
            <div>Latitude: {vehicle.latitude}</div>
            <div>Longitude: {vehicle.longitude}</div>
          </div>
          <a href={mapsUrl} target="_blank" referrerPolicy="no-referrer">
            <img
              className="navigate-icon"
              src={navigateIcon}
              title="View current location"
            />
          </a>
        </div>
      </div>
      <div className="notifications">
        <h4>{vehicle.notifications.length} Notifications</h4>
      </div>
    </div>
  );
};

export default VehicleListItem;
