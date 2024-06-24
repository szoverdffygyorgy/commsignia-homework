import { useVehicleContext } from "../../../../contexts/vehicle/vehicle-context";
import VehicleList from "../vehicle-list/vehicle-list";

const Vehicles = () => {
  const { query } = useVehicleContext();

  if (query?.isLoading) {
    return "Loading vehicles...";
  }

  if (!query?.data) {
    return "Failed to load vehicles.";
  }

  return <VehicleList vehicles={query.data.vehicles} />;
};

export default Vehicles;
