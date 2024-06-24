import VehicleLocationLink from "../../../../components/vehicle-location-link/vehicle-location-link";
import VehicleLocation from "../../../../components/vehicle-location/vehicle-location";
import { useVehicleDetailsContext } from "../../../../contexts/vehicle-details/vehicle-details-context";
import NotificationList from "../notification-list/notification-list";

import "./vehicle-details.css";

const VehicleDetails = () => {
  const { query } = useVehicleDetailsContext();

  if (query?.isLoading) {
    return "Loading...";
  }

  if (!query?.data) {
    return "Failed to load vehicle data.";
  }

  return (
    <div className="vehicle-details">
      <h2 className="header">Vehicle #{query.data.id}</h2>
      <div className="content">
        <div className="info">
          <h3>Location</h3>
          <div className="location-wrapper">
            <VehicleLocation vehicle={query.data} />
            <VehicleLocationLink vehicle={query.data} />
          </div>
          <h3>Notifications</h3>
          <NotificationList notifications={query.data.notifications} />
        </div>
        <iframe
          className="map"
          loading="lazy"
          allowFullScreen
          referrerPolicy="no-referrer-when-downgrade"
          src={`https://www.google.com/maps/embed/v1/place?key=AIzaSyCrYpR2TD7JUxk3FhNBtCRvQ14U2Fh_r0k
    &q=${query.data.latitude},${query.data.longitude}`}
        />
      </div>
    </div>
  );
};

export default VehicleDetails;
