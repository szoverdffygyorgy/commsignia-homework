import { useVehicleContext } from "../../contexts/vehicle/vehicle-context";

const Vehicles = () => {
  const { query, refetchVehicles } = useVehicleContext();

  console.log({ data: query?.data });

  return null;
};

export default Vehicles;
