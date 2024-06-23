import VehicleDetailsProvider from "../../contexts/vehicle-details/vehicle-details-provider";
import VehicleDetails from "./components/vehicle-details/vehicle-details";

const VehicleDetailsPage = () => {
  return (
    <VehicleDetailsProvider>
      <VehicleDetails />
    </VehicleDetailsProvider>
  );
};

export default VehicleDetailsPage;
