import { useParams } from "react-router-dom";
import VehicleDetailsDto from "../../api/dto/vehicle-details-dto";
import VehicleListItemDto from "../../api/dto/vehicle-list-item-dto";
import NavigateIcon from "../../assets/navigate.svg?react";

import "./vehicle-location-link.css";

type VehicleLocationLinkProps = {
  vehicle: VehicleListItemDto | VehicleDetailsDto;
};

const VehicleLocationLink = ({ vehicle }: VehicleLocationLinkProps) => {
  // Check if we're on a details page
  const { id } = useParams();

  const mapsUrl = `https://google.com/maps/search/?api=1&query=${vehicle.latitude},${vehicle.longitude}`;

  // The link has different color depending on what page it's shown on
  const className = id ? "quaternary" : "secondary";

  return (
    <a
      href={mapsUrl}
      target="_blank"
      referrerPolicy="no-referrer"
      title="View vehicle location"
    >
      <NavigateIcon className={`navigate-icon ${className}`} />
    </a>
  );
};

export default VehicleLocationLink;
