import { useParams } from "react-router-dom";
import VehicleDetailsDto from "../../api/dto/vehicle-details-dto";
import VehicleListItemDto from "../../api/dto/vehicle-list-item-dto";
import NavigateIcon from "../../assets/navigate.svg?react";

import "./vehicle-location-link.css";

type VehicleLocationLinkProps = {
  vehicle: VehicleListItemDto | VehicleDetailsDto;
};

const VehicleLocationLink = ({ vehicle }: VehicleLocationLinkProps) => {
  const { id } = useParams();

  const mapsUrl = `https://google.com/maps/search/?api=1&query=${vehicle.latitude},${vehicle.longitude}`;

  const className = id ? "quaternary" : "secondary";

  return (
    <a href={mapsUrl} target="_blank" referrerPolicy="no-referrer">
      <NavigateIcon
        className={`navigate-icon ${className}`}
        title="View vehicle location"
      />
    </a>
  );
};

export default VehicleLocationLink;
