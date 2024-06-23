import VehicleDetailsDto from "../../api/dto/vehicle-details-dto";
import VehicleListItemDto from "../../api/dto/vehicle-list-item-dto";

type VehicleLocationProps = {
  vehicle: VehicleDetailsDto | VehicleListItemDto;
};

const VehicleLocation = ({ vehicle }: VehicleLocationProps) => {
  return (
    <div className="vehicle-location">
      <div>Latitude: {vehicle.latitude}</div>
      <div>Longitude: {vehicle.longitude}</div>
    </div>
  );
};

export default VehicleLocation;
