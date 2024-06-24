const dateFormat = new Intl.DateTimeFormat("hu-HU", {
  year: "numeric",
  month: "long",
  day: "numeric",
  hour: "numeric",
  minute: "numeric",
  second: "numeric",
});

export default dateFormat;
